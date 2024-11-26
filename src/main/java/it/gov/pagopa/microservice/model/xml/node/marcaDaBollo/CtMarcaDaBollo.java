//
// Questo file è stato generato dall'Eclipse Implementation of JAXB, v3.0.0 
// Vedere https://eclipse-ee4j.github.io/jaxb-ri 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2024.11.25 alle 11:12:15 AM CET 
//


package it.gov.pagopa.microservice.model.xml.node.marcaDaBollo;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


/**
 * <p>Classe Java per ctMarcaDaBollo complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="ctMarcaDaBollo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="debitore" type="{}ctDebitore"/&gt;
 *         &lt;element name="enteCreditore" type="{}ctEnteCreditore"/&gt;
 *         &lt;element name="hashDocumento" type="{}ctHashDocumento"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ctMarcaDaBollo", propOrder = {
    "debitore",
    "enteCreditore",
    "hashDocumento"
})
public class CtMarcaDaBollo {

    @XmlElement(required = true)
    protected CtDebitore debitore;
    @XmlElement(required = true)
    protected CtEnteCreditore enteCreditore;
    @XmlElement(required = true)
    protected CtHashDocumento hashDocumento;

    /**
     * Recupera il valore della proprietà debitore.
     * 
     * @return
     *     possible object is
     *     {@link CtDebitore }
     *     
     */
    public CtDebitore getDebitore() {
        return debitore;
    }

    /**
     * Imposta il valore della proprietà debitore.
     * 
     * @param value
     *     allowed object is
     *     {@link CtDebitore }
     *     
     */
    public void setDebitore(CtDebitore value) {
        this.debitore = value;
    }

    /**
     * Recupera il valore della proprietà enteCreditore.
     * 
     * @return
     *     possible object is
     *     {@link CtEnteCreditore }
     *     
     */
    public CtEnteCreditore getEnteCreditore() {
        return enteCreditore;
    }

    /**
     * Imposta il valore della proprietà enteCreditore.
     * 
     * @param value
     *     allowed object is
     *     {@link CtEnteCreditore }
     *     
     */
    public void setEnteCreditore(CtEnteCreditore value) {
        this.enteCreditore = value;
    }

    /**
     * Recupera il valore della proprietà hashDocumento.
     * 
     * @return
     *     possible object is
     *     {@link CtHashDocumento }
     *     
     */
    public CtHashDocumento getHashDocumento() {
        return hashDocumento;
    }

    /**
     * Imposta il valore della proprietà hashDocumento.
     * 
     * @param value
     *     allowed object is
     *     {@link CtHashDocumento }
     *     
     */
    public void setHashDocumento(CtHashDocumento value) {
        this.hashDocumento = value;
    }

}
