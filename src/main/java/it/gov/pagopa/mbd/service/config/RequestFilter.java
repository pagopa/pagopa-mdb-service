package it.gov.pagopa.mbd.service.config;

import java.util.UUID;
import it.gov.pagopa.mbd.service.util.Constants;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.MDC;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
import org.springframework.web.server.ServerWebExchange;
import org.springframework.web.server.WebFilter;
import org.springframework.web.server.WebFilterChain;
import reactor.core.publisher.Mono;


@Component
@Order(Ordered.HIGHEST_PRECEDENCE)
@Slf4j
public class RequestFilter
        implements WebFilter
{

  /**
   * Get the request ID from the custom header "X-Request-Id" if present, otherwise it generates
   * one. Set the X-Request-Id value in the {@code response} and in the MDC
   *
   * @param exchange  http exchange
   * @param chain    next filter
   * @return
   */
  @Override
  public Mono<Void> filter(ServerWebExchange exchange, WebFilterChain chain) {
    try {

      // get requestId from header or generate one
      String requestId = exchange.getRequest().getHeaders().getFirst(Constants.HEADER_REQUEST_ID);
      if (requestId == null || requestId.isEmpty()) {
        requestId = UUID.randomUUID().toString();
      }

      // set requestId in MDC
      MDC.put("requestId", requestId);

      // set requestId in the response header
      exchange.getResponse().getHeaders().set(Constants.HEADER_REQUEST_ID, requestId);
    } finally {
      MDC.clear();
    }

    return chain.filter(exchange);

  }
}
