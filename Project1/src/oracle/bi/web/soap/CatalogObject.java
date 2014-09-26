
package oracle.bi.web.soap;

import javax.activation.DataHandler;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlMimeType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CatalogObject complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CatalogObject">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="catalogObject" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="catalogObjectBytes" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/>
 *         &lt;element name="itemInfo" type="{urn://oracle.bi.webservices/v6}ItemInfo" minOccurs="0"/>
 *         &lt;element name="errorInfo" type="{urn://oracle.bi.webservices/v6}ErrorInfo" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CatalogObject", propOrder = {
    "catalogObject",
    "catalogObjectBytes",
    "itemInfo",
    "errorInfo"
})
public class CatalogObject {

    protected String catalogObject;
    @XmlMimeType("application/obipscatalogobject")
    protected DataHandler catalogObjectBytes;
    protected ItemInfo itemInfo;
    protected ErrorInfo errorInfo;

    /**
     * Gets the value of the catalogObject property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCatalogObject() {
        return catalogObject;
    }

    /**
     * Sets the value of the catalogObject property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCatalogObject(String value) {
        this.catalogObject = value;
    }

    /**
     * Gets the value of the catalogObjectBytes property.
     * 
     * @return
     *     possible object is
     *     {@link DataHandler }
     *     
     */
    public DataHandler getCatalogObjectBytes() {
        return catalogObjectBytes;
    }

    /**
     * Sets the value of the catalogObjectBytes property.
     * 
     * @param value
     *     allowed object is
     *     {@link DataHandler }
     *     
     */
    public void setCatalogObjectBytes(DataHandler value) {
        this.catalogObjectBytes = value;
    }

    /**
     * Gets the value of the itemInfo property.
     * 
     * @return
     *     possible object is
     *     {@link ItemInfo }
     *     
     */
    public ItemInfo getItemInfo() {
        return itemInfo;
    }

    /**
     * Sets the value of the itemInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ItemInfo }
     *     
     */
    public void setItemInfo(ItemInfo value) {
        this.itemInfo = value;
    }

    /**
     * Gets the value of the errorInfo property.
     * 
     * @return
     *     possible object is
     *     {@link ErrorInfo }
     *     
     */
    public ErrorInfo getErrorInfo() {
        return errorInfo;
    }

    /**
     * Sets the value of the errorInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ErrorInfo }
     *     
     */
    public void setErrorInfo(ErrorInfo value) {
        this.errorInfo = value;
    }

}
