package it.gov.pagopa.microservice.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;

@Configuration
public class MarshalerConfig {

    @Bean
    public Jaxb2Marshaller marshaler() {
        Jaxb2Marshaller jaxb2Marshaller = new Jaxb2Marshaller();
        jaxb2Marshaller.setPackagesToScan("it.gov.pagopa.microservice.model.xml.node.marcaDaBollo");
        return jaxb2Marshaller;
    }

}
