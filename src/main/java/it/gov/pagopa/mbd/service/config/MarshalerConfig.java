package it.gov.pagopa.mbd.service.config;

import it.gov.pagopa.mbd.service.model.xml.node.marcaDaBollo.CtDebitore;
import it.gov.pagopa.mbd.service.model.xml.node.marcaDaBollo.CtEnteCreditore;
import it.gov.pagopa.mbd.service.model.xml.node.marcaDaBollo.CtHashDocumento;
import it.gov.pagopa.mbd.service.model.xml.node.marcaDaBollo.CtMarcaDaBollo;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;

@Configuration
public class MarshalerConfig {

    @Bean
    public Jaxb2Marshaller marshaler() {
        Jaxb2Marshaller jaxb2Marshaller = new Jaxb2Marshaller();
        jaxb2Marshaller.setClassesToBeBound(
                CtMarcaDaBollo.class, CtDebitore.class, CtEnteCreditore.class, CtHashDocumento.class);
        return jaxb2Marshaller;
    }

}
