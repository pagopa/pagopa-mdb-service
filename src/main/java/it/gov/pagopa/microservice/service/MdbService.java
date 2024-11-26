package it.gov.pagopa.microservice.service;

import it.gov.pagopa.microservice.model.mdb.GetMdbRequest;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Mono;

public interface MdbService {

    Mono<ServerResponse> getMdb(GetMdbRequest request);

    Mono<ServerResponse> getPaymentReceipts(String fiscalCode, String nav);

}
