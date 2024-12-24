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
import java.util.ArrayList;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Classe Java per ctTransferListPAReceiptV2 complex type.
 *
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 *
 * <pre>
 * &lt;complexType name="ctTransferListPAReceiptV2"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="transfer" type="{http://pagopa-api.pagopa.gov.it/pa/paForNode.xsd}ctTransferPAReceiptV2" maxOccurs="5"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
    name = "ctTransferListPAReceiptV2",
    propOrder = {"transfer"})
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class CtTransferListPAReceiptV2 {

  @XmlElement(required = true)
  protected List<CtTransferPAReceiptV2> transfer;

  /**
   * Gets the value of the transfer property.
   *
   * <p>This accessor method returns a reference to the live list, not a snapshot. Therefore any
   * modification you make to the returned list will be present inside the Jakarta XML Binding
   * object. This is why there is not a <CODE>set</CODE> method for the transfer property.
   *
   * <p>For example, to add a new item, do as follows:
   *
   * <pre>
   *    getTransfer().add(newItem);
   * </pre>
   *
   * <p>Objects of the following type(s) are allowed in the list {@link CtTransferPAReceiptV2 }
   */
  public List<CtTransferPAReceiptV2> getTransfer() {
    if (transfer == null) {
      transfer = new ArrayList<CtTransferPAReceiptV2>();
    }
    return this.transfer;
  }
}
