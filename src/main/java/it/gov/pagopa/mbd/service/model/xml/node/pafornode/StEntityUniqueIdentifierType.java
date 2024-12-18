//
// Questo file è stato generato dall'Eclipse Implementation of JAXB, v3.0.0
// Vedere https://eclipse-ee4j.github.io/jaxb-ri
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine.
// Generato il: 2024.12.18 alle 10:59:02 AM CET
//

package it.gov.pagopa.mbd.service.model.xml.node.pafornode;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;

/**
 * Classe Java per stEntityUniqueIdentifierType.
 *
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 *
 * <pre>
 * &lt;simpleType name="stEntityUniqueIdentifierType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="F"/&gt;
 *     &lt;enumeration value="G"/&gt;
 *     &lt;length value="1"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 */
@XmlType(name = "stEntityUniqueIdentifierType")
@XmlEnum
public enum StEntityUniqueIdentifierType {
  F,
  G;

  public String value() {
    return name();
  }

  public static StEntityUniqueIdentifierType fromValue(String v) {
    return valueOf(v);
  }
}
