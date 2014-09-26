
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
 *         &lt;element name="pathSrc" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="pathDest" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="flagACL" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
    "pathSrc",
    "pathDest",
    "flagACL",
    "sessionID"
})
@XmlRootElement(name = "copyItem")
public class CopyItem {

    @XmlElement(required = true)
    protected String pathSrc;
    @XmlElement(required = true)
    protected String pathDest;
    protected int flagACL;
    @XmlElement(required = true, nillable = true)
    protected String sessionID;

    /**
     * Gets the value of the pathSrc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPathSrc() {
        return pathSrc;
    }

    /**
     * Sets the value of the pathSrc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPathSrc(String value) {
        this.pathSrc = value;
    }

    /**
     * Gets the value of the pathDest property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPathDest() {
        return pathDest;
    }

    /**
     * Sets the value of the pathDest property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPathDest(String value) {
        this.pathDest = value;
    }

    /**
     * Gets the value of the flagACL property.
     * 
     */
    public int getFlagACL() {
        return flagACL;
    }

    /**
     * Sets the value of the flagACL property.
     * 
     */
    public void setFlagACL(int value) {
        this.flagACL = value;
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
