package it.gov.pagopa.mbd.service.service.impl;

import it.gov.pagopa.mbd.service.client.ReactiveClient;
import it.gov.pagopa.mbd.service.exception.AppException;
import it.gov.pagopa.mbd.service.exception.WebClientException;
import it.gov.pagopa.mbd.service.model.carts.GetCartResponse;
import it.gov.pagopa.mbd.service.model.mdb.GetMbdRequest;
import it.gov.pagopa.mbd.service.model.mdb.PaymentNotice;
import it.gov.pagopa.mbd.service.model.mdb.ReturnUrls;
import it.gov.pagopa.mbd.service.model.xml.node.nodeforpsp.*;
import it.gov.pagopa.mbd.service.model.xml.node.pafornode.CtReceiptV2;
import it.gov.pagopa.mbd.service.model.xml.node.pafornode.CtTransferListPAReceiptV2;
import it.gov.pagopa.mbd.service.model.xml.node.pafornode.CtTransferPAReceiptV2;
import it.gov.pagopa.mbd.service.model.xml.node.pafornode.PaSendRTV2Request;
import it.gov.pagopa.mbd.service.model.xml.xsd.common_types.v1_0.StOutcome;
import it.gov.pagopa.mbd.service.service.MbdService;
import jakarta.inject.Inject;
import jakarta.validation.ConstraintViolationException;
import java.math.BigDecimal;
import java.util.Collections;
import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.web.reactive.function.client.WebClientResponseException;
import reactor.core.publisher.Mono;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import java.math.BigDecimal;
import java.nio.charset.Charset;
import java.util.Collections;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

@SpringBootTest
class MdbServiceImplTest {

    @MockBean
    private ReactiveClient reactiveClient;

    @Inject
    private MbdService mbdService;

    @Test
    void getMdbShouldReturnResponseEntityOnValidData() throws DatatypeConfigurationException {
        DemandPaymentNoticeResponse demandPaymentNoticeResponse = DemandPaymentNoticeResponse.builder()
                .qrCode(CtQrCode.builder()
                        .noticeNumber("3000000001")
                        .fiscalCode("AAAAAAAAAA01")
                        .build())
                .paymentList(
                    CtPaymentOptionsDescriptionList.builder()
                        .paymentOptionDescription(Collections.singletonList(
                            CtPaymentOptionDescription.builder()
                                    .paymentNote("Note")
                                    .amount(BigDecimal.TEN)
                                    .dueDate(DatatypeFactory.newInstance().newXMLGregorianCalendar())
                                    .options(StAmountOptionPSP.ANY).build()
                        ))
                        .build()).build();
        demandPaymentNoticeResponse.setOutcome(StOutcome.OK);
        when(reactiveClient.demandPaymentNotice(any())).thenAnswer(
                item -> Mono.just(demandPaymentNoticeResponse));

        GetCartResponse getCartResponse = GetCartResponse.builder().checkoutRedirectUrl("testUrl").build();
        when(reactiveClient.getCart(any())).thenAnswer(item -> Mono.just(getCartResponse));

        Mono<ResponseEntity> responseEntityMono = mbdService.getMbd("test",GetMbdRequest.builder()
                        .idCIService("1000")
                        .paymentNotices(Collections.singletonList(
                                PaymentNotice.builder()
                                        .amount(1000L)
                                        .documentHash("1".repeat(44))
                                        .email("test@gmail.com")
                                        .fiscalCode("AAAAAAAAAAAAA01")
                                        .lastName("test")
                                        .firstName("test")
                                        .province("RM")
                                        .build()
                        ))
                        .returnUrls(ReturnUrls.builder()
                                .errorUrl("testUrl")
                                .successUrl("testUrl")
                                .cancelUrl("testUrl")
                                .build())
                .build());

        ResponseEntity responseEntity = responseEntityMono.block();
        assertTrue(responseEntity.getStatusCode().is2xxSuccessful());
        GetCartResponse response = (GetCartResponse) responseEntity.getBody();
        assertEquals(response.getCheckoutRedirectUrl(), "testUrl");
    }

    @Test
    void getMdbShouldReturnKoOnErrorClientCall() throws DatatypeConfigurationException {
        DemandPaymentNoticeResponse demandPaymentNoticeResponse = DemandPaymentNoticeResponse.builder()
                .qrCode(CtQrCode.builder()
                        .noticeNumber("3000000001")
                        .fiscalCode("AAAAAAAAAA01")
                        .build())
                .paymentList(
                        CtPaymentOptionsDescriptionList.builder()
                                .paymentOptionDescription(Collections.singletonList(
                                        CtPaymentOptionDescription.builder()
                                                .paymentNote("Note")
                                                .amount(BigDecimal.TEN)
                                                .dueDate(DatatypeFactory.newInstance().newXMLGregorianCalendar())
                                                .options(StAmountOptionPSP.ANY).build()
                                ))
                                .build()).build();
        demandPaymentNoticeResponse.setOutcome(StOutcome.OK);
        when(reactiveClient.demandPaymentNotice(any())).thenAnswer(
                item -> Mono.just(demandPaymentNoticeResponse));

        when(reactiveClient.getCart(any())).thenAnswer(item -> Mono.error(new WebClientException("Error", null)));

        Mono<ResponseEntity> responseEntityMono = mbdService.getMbd("test",GetMbdRequest.builder()
                .idCIService("1000")
                .paymentNotices(Collections.singletonList(
                        PaymentNotice.builder()
                                .amount(1000L)
                                .documentHash("1".repeat(44))
                                .email("test@gmail.com")
                                .fiscalCode("AAAAAAAAAAAAA01")
                                .lastName("test")
                                .firstName("test")
                                .province("RM")
                                .build()
                ))
                .returnUrls(ReturnUrls.builder()
                        .errorUrl("testUrl")
                        .successUrl("testUrl")
                        .cancelUrl("testUrl")
                        .build())
                .build());

        assertThrows(AppException.class, () -> responseEntityMono.block());

    }

    @Test
    void getMdbShouldReturnKOOnInvalidData() throws DatatypeConfigurationException {
        DemandPaymentNoticeResponse demandPaymentNoticeResponse = DemandPaymentNoticeResponse.builder()
                .qrCode(CtQrCode.builder()
                        .noticeNumber("3000000001")
                        .fiscalCode("AAAAAAAAAA01")
                        .build())
                .paymentList(
                        CtPaymentOptionsDescriptionList.builder()
                                .paymentOptionDescription(Collections.singletonList(
                                        CtPaymentOptionDescription.builder()
                                                .paymentNote("Note")
                                                .amount(BigDecimal.TEN)
                                                .dueDate(DatatypeFactory.newInstance().newXMLGregorianCalendar())
                                                .options(StAmountOptionPSP.ANY).build()
                                ))
                                .build()).build();
        demandPaymentNoticeResponse.setOutcome(StOutcome.OK);
        when(reactiveClient.demandPaymentNotice(any())).thenAnswer(
                item -> Mono.just(demandPaymentNoticeResponse));

        GetCartResponse getCartResponse = GetCartResponse.builder().checkoutRedirectUrl("testUrl").build();
        when(reactiveClient.getCart(any())).thenAnswer(item -> Mono.just(getCartResponse));

        Mono<ResponseEntity> responseEntityMono = mbdService.getMbd("test",GetMbdRequest.builder()
                .idCIService("1000")
                .paymentNotices(Collections.singletonList(
                        PaymentNotice.builder()
                                .amount(1000L)
                                .documentHash("1".repeat(10))
                                .email("test@gmail.com")
                                .fiscalCode("AAAAAAAAAAAAA01")
                                .lastName("test")
                                .firstName("test")
                                .province("RM")
                                .build()
                ))
                .returnUrls(ReturnUrls.builder()
                        .errorUrl("testUrl")
                        .successUrl("testUrl")
                        .cancelUrl("testUrl")
                        .build())
                .build());

        assertThrows(ConstraintViolationException.class, () -> responseEntityMono.block());
    }

    @Test
    void getPaymentReceiptsShouldReturnOk() {
        when(reactiveClient.getPaymentReceipt(any(),any())).thenAnswer(
                item -> Mono.just(PaSendRTV2Request.builder().receipt(
                        CtReceiptV2.builder().transferList(
                                CtTransferListPAReceiptV2.builder()
                                        .transfer(Collections.singletonList(
                                                CtTransferPAReceiptV2.builder()
                                                        .mbdAttachment("test".getBytes())
                                                        .build()
                                        )).build()).build()).build()));
        ResponseEntity responseEntity = mbdService.getPaymentReceipts("test","test").block();
        assertTrue(responseEntity.getStatusCode().is2xxSuccessful());
    }

    @Test
    void getPaymentReceiptsShouldReturnKoException() {
        WebClientException error = new WebClientException("Error on test call", null);
        when(reactiveClient.getPaymentReceipt(any(),any())).thenAnswer(
                item -> Mono.error(error));
        assertThrows(AppException.class, () -> mbdService.getPaymentReceipts("test","test").block());
    }

}