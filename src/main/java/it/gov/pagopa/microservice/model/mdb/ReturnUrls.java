package it.gov.pagopa.microservice.model.mdb;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ReturnUrls {

    private String successUrl;
    private String cancelUrl;
    private String errorUrl;

}
