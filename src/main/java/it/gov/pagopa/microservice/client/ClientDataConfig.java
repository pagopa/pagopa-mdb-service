package it.gov.pagopa.microservice.client;

import lombok.Data;
import org.springframework.stereotype.Component;

@Component
@Data
public class ClientDataConfig {

    private String demandPaymentEndpoint;

    private String getCartEndpoint;

    private String getPaymentReceiptEndpoint;

    private String demandPaymentSubscriptionKey;

    private String getCartSubscriptionKey;

    private String getPaymentReceiptSubscriptionKey;

}
