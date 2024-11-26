package it.gov.pagopa.microservice.controller;

import it.gov.pagopa.microservice.exception.AppException;
import it.gov.pagopa.microservice.model.carts.GetCartErrorResponse;
import it.gov.pagopa.microservice.model.mdb.GetMdbRequest;
import it.gov.pagopa.microservice.service.MdbService;
import jakarta.websocket.server.PathParam;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Mono;

@RestController
public class MbdController {

    private final MdbService mdbService;

    public MbdController(MdbService mdbService) {
        this.mdbService = mdbService;
    }

    @PostMapping("/mbd")
    public Mono<ServerResponse> getMdb(GetMdbRequest request) {
        return mdbService.getMdb(request).onErrorResume(e -> {
            if (e instanceof AppException) {
                return ServerResponse.status(((AppException) e).getHttpStatus()).body(
                        GetCartErrorResponse.builder().code(((AppException) e).getTitle())
                                .message(e.getMessage())
                                .errorUrl(request.getReturnUrls().getErrorUrl()).build(),
                        GetCartErrorResponse.class);
            }
            return ServerResponse.status(HttpStatus.INTERNAL_SERVER_ERROR).bodyValue(GetCartErrorResponse.builder()
                    .errorUrl(request.getReturnUrls().getErrorUrl()).build());
        });
    }

    @GetMapping("/mbd-payments/{fiscalCode}/receipt/{nav}")
    public Mono<ServerResponse> getPaymentReceipts(@PathParam("fiscalCode") String fiscalCode,
                                                   @PathParam("nav") String nav) {
        return mdbService.getPaymentReceipts(fiscalCode, nav);
    }

}
