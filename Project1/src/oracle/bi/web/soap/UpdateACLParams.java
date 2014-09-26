
package oracle.bi.web.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UpdateACLParams complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UpdateACLParams">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="updateFlag" type="{urn://oracle.bi.webservices/v6}UpdateACLMode"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UpdateACLParams", propOrder = {
    "updateFlag"
})
@XmlSeeAlso({
    UpdateCatalogItemACLParams.class
})
public class UpdateACLParams {

    @XmlElement(required = true)
    protected UpdateACLMode updateFlag;

    /**
     * Gets the value of the updateFlag property.
     * 
     * @return
     *     possible object is
     *     {@link UpdateACLMode }
     *     
     */
    public UpdateACLMode getUpdateFlag() {
        return updateFlag;
    }

    /**
     * Sets the value of the updateFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link UpdateACLMode }
     *     
     */
    public void setUpdateFlag(UpdateACLMode value) {
        this.updateFlag = value;
    }

}
