//
// Questo file è stato generato dall'Eclipse Implementation of JAXB, v3.0.0 
// Vedere https://eclipse-ee4j.github.io/jaxb-ri 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2024.12.12 alle 03:15:53 PM CET 
//


package it.gov.pagopa.mbd.service.model.xml.node.marcaDaBollo;

import jakarta.xml.bind.annotation.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


/**
 * <p>Classe Java per ctService complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="ctService"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="debtorFiscalCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="debtorName" type="{http://PuntoAccessoPSP.spcoop.gov.it/GeneralService}stText50"/&gt;
 *         &lt;element name="debtorSurname" type="{http://PuntoAccessoPSP.spcoop.gov.it/GeneralService}stText50"/&gt;
 *         &lt;element name="debtorEmail" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="debtorProvince" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ciFiscalCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="documentHash" type="{http://PuntoAccessoPSP.spcoop.gov.it/GeneralService}stTextBase64"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ctService", propOrder = {
    "debtorFiscalCode",
    "debtorName",
    "debtorSurname",
    "debtorEmail",
    "debtorProvince",
    "ciFiscalCode",
    "documentHash"
})
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
@XmlRootElement
public class CtService {

    @XmlElement(required = true)
    protected String debtorFiscalCode;
    @XmlElement(required = true)
    protected String debtorName;
    @XmlElement(required = true)
    protected String debtorSurname;
    @XmlElement(required = true)
    protected String debtorEmail;
    @XmlElement(required = true)
    protected String debtorProvince;
    @XmlElement(required = true)
    protected String ciFiscalCode;
    @XmlElement(required = true)
    protected String documentHash;

    /**
     * Recupera il valore della proprietà debtorFiscalCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDebtorFiscalCode() {
        return debtorFiscalCode;
    }

    /**
     * Imposta il valore della proprietà debtorFiscalCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDebtorFiscalCode(String value) {
        this.debtorFiscalCode = value;
    }

    /**
     * Recupera il valore della proprietà debtorName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDebtorName() {
        return debtorName;
    }

    /**
     * Imposta il valore della proprietà debtorName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDebtorName(String value) {
        this.debtorName = value;
    }

    /**
     * Recupera il valore della proprietà debtorSurname.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDebtorSurname() {
        return debtorSurname;
    }

    /**
     * Imposta il valore della proprietà debtorSurname.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDebtorSurname(String value) {
        this.debtorSurname = value;
    }

    /**
     * Recupera il valore della proprietà debtorEmail.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDebtorEmail() {
        return debtorEmail;
    }

    /**
     * Imposta il valore della proprietà debtorEmail.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDebtorEmail(String value) {
        this.debtorEmail = value;
    }

    /**
     * Recupera il valore della proprietà debtorProvince.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDebtorProvince() {
        return debtorProvince;
    }

    /**
     * Imposta il valore della proprietà debtorProvince.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDebtorProvince(String value) {
        this.debtorProvince = value;
    }

    /**
     * Recupera il valore della proprietà ciFiscalCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCiFiscalCode() {
        return ciFiscalCode;
    }

    /**
     * Imposta il valore della proprietà ciFiscalCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCiFiscalCode(String value) {
        this.ciFiscalCode = value;
    }

    /**
     * Recupera il valore della proprietà documentHash.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocumentHash() {
        return documentHash;
    }

    /**
     * Imposta il valore della proprietà documentHash.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocumentHash(String value) {
        this.documentHash = value;
    }

}
