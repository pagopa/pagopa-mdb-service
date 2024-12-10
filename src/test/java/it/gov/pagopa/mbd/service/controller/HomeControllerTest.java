package it.gov.pagopa.mbd.service.controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.web.reactive.server.WebTestClient;

class HomeControllerTest {

    @Autowired
    private WebTestClient webClient;

    @Test
    void healthCheckTestSuccess() throws Exception {
        webClient.get().uri("/info").exchange().expectStatus().is2xxSuccessful();
    }

    @Test
    void homeTestSuccess() throws Exception {
        webClient.get().exchange().expectStatus().is3xxRedirection();
    }
}