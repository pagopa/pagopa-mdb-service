//
// Questo file è stato generato dall'Eclipse Implementation of JAXB, v3.0.0
// Vedere https://eclipse-ee4j.github.io/jaxb-ri
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine.
// Generato il: 2024.12.12 alle 03:15:53 PM CET
//

package it.gov.pagopa.mbd.service.model.xml.node.marcaDaBollo;

import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;

/**
 * This object contains factory methods for each Java content interface and Java element interface
 * generated in the it.gov.spcoop.puntoaccessopsp.generalservice package.
 *
 * <p>An ObjectFactory allows you to programatically construct new instances of the Java
 * representation for XML content. The Java representation of XML content can consist of schema
 * derived interfaces and classes representing the binding of schema type definitions, element
 * declarations and model groups. Factory methods for each of these are provided in this class.
 */
@XmlRegistry
public class ObjectFactory {

  private static final QName _Service_QNAME =
      new QName("http://PuntoAccessoPSP.spcoop.gov.it/GeneralService", "service");

  /**
   * Create a new ObjectFactory that can be used to create new instances of schema derived classes
   * for package: it.gov.spcoop.puntoaccessopsp.generalservice
   */
  public ObjectFactory() {}

  /** Create an instance of {@link CtService } */
  public CtService createCtService() {
    return new CtService();
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link CtService }{@code >}
   *
   * @param value Java instance representing xml element's value.
   * @return the new instance of {@link JAXBElement }{@code <}{@link CtService }{@code >}
   */
  @XmlElementDecl(
      namespace = "http://PuntoAccessoPSP.spcoop.gov.it/GeneralService",
      name = "service")
  public JAXBElement<CtService> createService(CtService value) {
    return new JAXBElement<CtService>(_Service_QNAME, CtService.class, null, value);
  }
}
