
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
 *         &lt;element name="obj" type="{urn://oracle.bi.webservices/v6}CatalogObject"/>
 *         &lt;element name="path" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="resolveLinks" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="allowOverwrite" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
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
    "obj",
    "path",
    "resolveLinks",
    "allowOverwrite",
    "sessionID"
})
@XmlRootElement(name = "writeIBot")
public class WriteIBot {

    @XmlElement(required = true)
    protected CatalogObject obj;
    @XmlElement(required = true)
    protected String path;
    protected boolean resolveLinks;
    protected boolean allowOverwrite;
    @XmlElement(required = true, nillable = true)
    protected String sessionID;

    /**
     * Gets the value of the obj property.
     * 
     * @return
     *     possible object is
     *     {@link CatalogObject }
     *     
     */
    public CatalogObject getObj() {
        return obj;
    }

    /**
     * Sets the value of the obj property.
     * 
     * @param value
     *     allowed object is
     *     {@link CatalogObject }
     *     
     */
    public void setObj(CatalogObject value) {
        this.obj = value;
    }

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
     * Gets the value of the allowOverwrite property.
     * 
     */
    public boolean isAllowOverwrite() {
        return allowOverwrite;
    }

    /**
     * Sets the value of the allowOverwrite property.
     * 
     */
    public void setAllowOverwrite(boolean value) {
        this.allowOverwrite = value;
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
