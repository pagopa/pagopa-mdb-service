//
// Questo file è stato generato dall'Eclipse Implementation of JAXB, v3.0.0 
// Vedere https://eclipse-ee4j.github.io/jaxb-ri 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2024.11.21 alle 04:46:32 PM CET 
//


package it.gov.pagopa.microservice.model.xml.node.nodeforpsp;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per stPaymentMethod.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * <pre>
 * &lt;simpleType name="stPaymentMethod"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="cash"/&gt;
 *     &lt;enumeration value="creditCard"/&gt;
 *     &lt;enumeration value="bancomat"/&gt;
 *     &lt;enumeration value="other"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "stPaymentMethod")
@XmlEnum
public enum StPaymentMethod {

    @XmlEnumValue("cash")
    CASH("cash"),
    @XmlEnumValue("creditCard")
    CREDIT_CARD("creditCard"),
    @XmlEnumValue("bancomat")
    BANCOMAT("bancomat"),
    @XmlEnumValue("other")
    OTHER("other");
    private final String value;

    StPaymentMethod(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static StPaymentMethod fromValue(String v) {
        for (StPaymentMethod c: StPaymentMethod.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
