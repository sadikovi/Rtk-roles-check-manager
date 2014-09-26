
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
 *         &lt;element name="fromPath" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="toPath" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
    "fromPath",
    "toPath",
    "resolveLinks",
    "allowOverwrite",
    "sessionID"
})
@XmlRootElement(name = "moveIBot")
public class MoveIBot {

    @XmlElement(required = true)
    protected String fromPath;
    @XmlElement(required = true)
    protected String toPath;
    protected boolean resolveLinks;
    protected boolean allowOverwrite;
    @XmlElement(required = true, nillable = true)
    protected String sessionID;

    /**
     * Gets the value of the fromPath property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFromPath() {
        return fromPath;
    }

    /**
     * Sets the value of the fromPath property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFromPath(String value) {
        this.fromPath = value;
    }

    /**
     * Gets the value of the toPath property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getToPath() {
        return toPath;
    }

    /**
     * Sets the value of the toPath property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setToPath(String value) {
        this.toPath = value;
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
