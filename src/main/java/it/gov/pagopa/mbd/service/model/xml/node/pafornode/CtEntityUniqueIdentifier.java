//
// Questo file è stato generato dall'Eclipse Implementation of JAXB, v3.0.0
// Vedere https://eclipse-ee4j.github.io/jaxb-ri
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine.
// Generato il: 2024.12.18 alle 10:59:02 AM CET
//

package it.gov.pagopa.mbd.service.model.xml.node.pafornode;

import jakarta.xml.bind.annotation.*;


/**
 * <p>Classe Java per ctEntityUniqueIdentifier complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="ctEntityUniqueIdentifier"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="entityUniqueIdentifierType" type="{http://pagopa-api.pagopa.gov.it/pa/paForNode.xsd}stEntityUniqueIdentifierType"/&gt;
 *         &lt;element name="entityUniqueIdentifierValue" type="{http://pagopa-api.pagopa.gov.it/pa/paForNode.xsd}stEntityUniqueIdentifierValue"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ctEntityUniqueIdentifier", propOrder = {
    "entityUniqueIdentifierType",
    "entityUniqueIdentifierValue"
})
public class CtEntityUniqueIdentifier {

    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected StEntityUniqueIdentifierType entityUniqueIdentifierType;
    @XmlElement(required = true)
    protected String entityUniqueIdentifierValue;

    /**
     * Recupera il valore della proprietà entityUniqueIdentifierType.
     * 
     * @return
     *     possible object is
     *     {@link StEntityUniqueIdentifierType }
     *     
     */
    public StEntityUniqueIdentifierType getEntityUniqueIdentifierType() {
        return entityUniqueIdentifierType;
    }

    /**
     * Imposta il valore della proprietà entityUniqueIdentifierType.
     * 
     * @param value
     *     allowed object is
     *     {@link StEntityUniqueIdentifierType }
     *     
     */
    public void setEntityUniqueIdentifierType(StEntityUniqueIdentifierType value) {
        this.entityUniqueIdentifierType = value;
    }

    /**
     * Recupera il valore della proprietà entityUniqueIdentifierValue.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEntityUniqueIdentifierValue() {
        return entityUniqueIdentifierValue;
    }

    /**
     * Imposta il valore della proprietà entityUniqueIdentifierValue.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEntityUniqueIdentifierValue(String value) {
        this.entityUniqueIdentifierValue = value;
    }

}
