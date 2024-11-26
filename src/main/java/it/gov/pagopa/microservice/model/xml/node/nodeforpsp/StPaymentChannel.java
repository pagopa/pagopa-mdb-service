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
 * <p>Classe Java per stPaymentChannel.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * <pre>
 * &lt;simpleType name="stPaymentChannel"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="frontOffice"/&gt;
 *     &lt;enumeration value="atm"/&gt;
 *     &lt;enumeration value="onLine"/&gt;
 *     &lt;enumeration value="app"/&gt;
 *     &lt;enumeration value="other"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "stPaymentChannel")
@XmlEnum
public enum StPaymentChannel {

    @XmlEnumValue("frontOffice")
    FRONT_OFFICE("frontOffice"),
    @XmlEnumValue("atm")
    ATM("atm"),
    @XmlEnumValue("onLine")
    ON_LINE("onLine"),
    @XmlEnumValue("app")
    APP("app"),
    @XmlEnumValue("other")
    OTHER("other");
    private final String value;

    StPaymentChannel(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static StPaymentChannel fromValue(String v) {
        for (StPaymentChannel c: StPaymentChannel.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
