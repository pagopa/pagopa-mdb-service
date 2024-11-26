package it.gov.pagopa.microservice.client;

import it.gov.pagopa.microservice.model.carts.GetCartRequest;
import it.gov.pagopa.microservice.model.carts.GetCartResponse;
import it.gov.pagopa.microservice.model.xml.node.nodeforpsp.DemandPaymentNoticeRequest;
import it.gov.pagopa.microservice.model.xml.node.nodeforpsp.DemandPaymentNoticeResponse;
import it.gov.pagopa.microservice.model.xml.node.pafornode.CtTransferPAReceiptV2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

@Component
public class ReactiveClient {

    private final WebClient webClient;

    private final ClientDataConfig clientDataConfig;

    private final String OCP_SUBSCRIPTION_KEY = "OcpSubscriptionKey";

    @Autowired
    public ReactiveClient(WebClient webClient, ClientDataConfig clientDataConfig) {
        this.webClient = webClient;
        this.clientDataConfig = clientDataConfig;
    }

    public Mono<DemandPaymentNoticeResponse> demandPaymentNotice(DemandPaymentNoticeRequest demandPaymentNoticeRequest) {

        return webClient.post()
                .uri(clientDataConfig.getDemandPaymentEndpoint())
                .header(HttpHeaders.CONTENT_TYPE, MediaType.APPLICATION_XML_VALUE)
                .header(OCP_SUBSCRIPTION_KEY, clientDataConfig.getDemandPaymentSubscriptionKey())
                .body(Mono.just(demandPaymentNoticeRequest) , DemandPaymentNoticeRequest.class)
                .retrieve()
                .bodyToMono(DemandPaymentNoticeResponse.class);

    }

    public Mono<GetCartResponse> getCart(GetCartRequest getCartRequest) {

        return webClient.post()
                .uri(clientDataConfig.getGetCartEndpoint())
                .header(OCP_SUBSCRIPTION_KEY, clientDataConfig.getGetCartSubscriptionKey())
                .header(HttpHeaders.CONTENT_TYPE, MediaType.APPLICATION_JSON_VALUE)
                .body(Mono.just(getCartRequest) , GetCartRequest.class)
                .retrieve()
                .bodyToMono(GetCartResponse.class);

    }

    public Mono<CtTransferPAReceiptV2> getPaymentReceipt(String fiscalCode, String iuv) {

        return webClient.post()
                .uri(clientDataConfig.getGetPaymentReceiptEndpoint())
                .header(OCP_SUBSCRIPTION_KEY, clientDataConfig.getGetPaymentReceiptSubscriptionKey())
                .retrieve()
                .bodyToMono(CtTransferPAReceiptV2.class);

    }

}
