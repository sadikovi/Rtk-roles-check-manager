
package oracle.bi.web.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="path" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="mask" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="resolveLinks" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="options" type="{urn://oracle.bi.webservices/v6}GetSubItemsParams"/>
 *         &lt;element name="sessionID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "path",
    "mask",
    "resolveLinks",
    "options",
    "sessionID"
})
@XmlRootElement(name = "getSubItems")
public class GetSubItems {

    @XmlElement(required = true)
    protected String path;
    @XmlElement(required = true)
    protected String mask;
    protected boolean resolveLinks;
    @XmlElement(required = true, nillable = true)
    protected GetSubItemsParams options;
    @XmlElement(required = true, nillable = true)
    protected String sessionID;

    /**
     * Gets the value of the path property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPath() {
        return path;
    }

    /**
     * Sets the value of the path property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPath(String value) {
        this.path = value;
    }

    /**
     * Gets the value of the mask property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMask() {
        return mask;
    }

    /**
     * Sets the value of the mask property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMask(String value) {
        this.mask = value;
    }

    /**
     * Gets the value of the resolveLinks property.
     * 
     */
    public boolean isResolveLinks() {
        return resolveLinks;
    }

    /**
     * Sets the value of the resolveLinks property.
     * 
     */
    public void setResolveLinks(boolean value) {
        this.resolveLinks = value;
    }

    /**
     * Gets the value of the options property.
     * 
     * @return
     *     possible object is
     *     {@link GetSubItemsParams }
     *     
     */
    public GetSubItemsParams getOptions() {
        return options;
    }

    /**
     * Sets the value of the options property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetSubItemsParams }
     *     
     */
    public void setOptions(GetSubItemsParams value) {
        this.options = value;
    }

    /**
     * Gets the value of the sessionID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSessionID() {
        return sessionID;
    }

    /**
     * Sets the value of the sessionID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSessionID(String value) {
        this.sessionID = value;
    }

}
