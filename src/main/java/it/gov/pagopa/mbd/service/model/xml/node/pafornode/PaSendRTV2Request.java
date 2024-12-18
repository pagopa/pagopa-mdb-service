//
// Questo file è stato generato dall'Eclipse Implementation of JAXB, v3.0.0 
// Vedere https://eclipse-ee4j.github.io/jaxb-ri 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2024.12.18 alle 10:59:02 AM CET 
//


package it.gov.pagopa.mbd.service.model.xml.node.pafornode;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


/**
 * <p>Classe Java per paSendRTV2Request complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="paSendRTV2Request"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="idPA" type="{http://pagopa-api.pagopa.gov.it/xsd/common-types/v1.0.0/}stText35"/&gt;
 *         &lt;element name="idBrokerPA" type="{http://pagopa-api.pagopa.gov.it/xsd/common-types/v1.0.0/}stText35"/&gt;
 *         &lt;element name="idStation" type="{http://pagopa-api.pagopa.gov.it/xsd/common-types/v1.0.0/}stText35"/&gt;
 *         &lt;element name="receipt" type="{http://pagopa-api.pagopa.gov.it/pa/paForNode.xsd}ctReceiptV2"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "paSendRTV2Request", propOrder = {
    "idPA",
    "idBrokerPA",
    "idStation",
    "receipt"
})
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class PaSendRTV2Request {

    @XmlElement(required = true)
    protected String idPA;
    @XmlElement(required = true)
    protected String idBrokerPA;
    @XmlElement(required = true)
    protected String idStation;
    @XmlElement(required = true)
    protected CtReceiptV2 receipt;

    /**
     * Recupera il valore della proprietà idPA.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdPA() {
        return idPA;
    }

    /**
     * Imposta il valore della proprietà idPA.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdPA(String value) {
        this.idPA = value;
    }

  /**
   * Imposta il valore della proprietà idPA.
   *
   * @param value allowed object is {@link String }
   */
  public void setIdPA(String value) {
    this.idPA = value;
  }

  /**
   * Recupera il valore della proprietà idBrokerPA.
   *
   * @return possible object is {@link String }
   */
  public String getIdBrokerPA() {
    return idBrokerPA;
  }

  /**
   * Recupera il valore della proprietà idStation.
   *
   * @return possible object is {@link String }
   */
  public String getIdStation() {
    return idStation;
  }

  /**
   * Imposta il valore della proprietà idStation.
   *
   * @param value allowed object is {@link String }
   */
  public void setIdStation(String value) {
    this.idStation = value;
  }

  /**
   * Recupera il valore della proprietà receipt.
   *
   * @return possible object is {@link CtReceiptV2 }
   */
  public CtReceiptV2 getReceipt() {
    return receipt;
  }

  /**
   * Imposta il valore della proprietà receipt.
   *
   * @param value allowed object is {@link CtReceiptV2 }
   */
  public void setReceipt(CtReceiptV2 value) {
    this.receipt = value;
  }

  /**
   * Imposta il valore della proprietà receipt.
   *
   * @param value allowed object is {@link CtReceiptV2 }
   */
  public void setReceipt(CtReceiptV2 value) {
    this.receipt = value;
  }
}
