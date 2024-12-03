package it.gov.pagopa.mbd.service.service.impl;

import it.gov.pagopa.mbd.service.client.ReactiveClient;
import it.gov.pagopa.mbd.service.controller.MbdController;
import it.gov.pagopa.mbd.service.model.xml.node.nodeforpsp.CtPaymentOptionDescription;
import it.gov.pagopa.mbd.service.model.xml.node.nodeforpsp.CtPaymentOptionsDescriptionList;
import it.gov.pagopa.mbd.service.model.xml.node.nodeforpsp.DemandPaymentNoticeResponse;
import it.gov.pagopa.mbd.service.model.xml.node.nodeforpsp.StAmountOptionPSP;
import it.gov.pagopa.mbd.service.model.xml.xsd.common_types.v1_0.StOutcome;
import it.gov.pagopa.mbd.service.service.MdbService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.boot.test.autoconfigure.web.reactive.WebFluxTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import reactor.core.publisher.Mono;

import java.util.Collections;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

@ExtendWith(SpringExtension.class)
class MdbServiceImplTest {

    @MockBean
    private ReactiveClient reactiveClient;

    @Test
    void getMdbShouldReturnResponseEntityOnValidData() {
//        DemandPaymentNoticeResponse demandPaymentNoticeResponse = DemandPaymentNoticeResponse.builder().paymentList(
//                CtPaymentOptionsDescriptionList.builder()
//                        .paymentOptionDescription(Collections.singletonList(
//                            CtPaymentOptionDescription.builder().options(StAmountOptionPSP.ANY).build()
//                        ))
//                        .build()).build();
//        demandPaymentNoticeResponse.setOutcome(StOutcome.OK);
//        when(reactiveClient.demandPaymentNotice(any())).thenAnswer(
//                item -> Mono.just(demandPaymentNoticeResponse));



    }

    @Test
    void getPaymentReceipts() {
    }
}