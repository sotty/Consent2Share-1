
package echosign.api.clientv20.dto17;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfDocumentLibraryItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfDocumentLibraryItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DocumentLibraryItem" type="{http://dto17.api.echosign}DocumentLibraryItem" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfDocumentLibraryItem", propOrder = {
    "documentLibraryItem"
})
public class ArrayOfDocumentLibraryItem {

    @XmlElement(name = "DocumentLibraryItem", nillable = true)
    protected List<DocumentLibraryItem> documentLibraryItem;

    /**
     * Gets the value of the documentLibraryItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the documentLibraryItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDocumentLibraryItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DocumentLibraryItem }
     * 
     * 
     */
    public List<DocumentLibraryItem> getDocumentLibraryItem() {
        if (documentLibraryItem == null) {
            documentLibraryItem = new ArrayList<DocumentLibraryItem>();
        }
        return this.documentLibraryItem;
    }

}
