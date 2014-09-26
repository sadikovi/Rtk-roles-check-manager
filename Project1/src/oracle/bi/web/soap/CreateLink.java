
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
 *         &lt;element name="pathTarget" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="overwriteIfExists" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
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
    "pathTarget",
    "overwriteIfExists",
    "sessionID"
})
@XmlRootElement(name = "createLink")
public class CreateLink {

    @XmlElement(required = true)
    protected String path;
    @XmlElement(required = true)
    protected String pathTarget;
    protected boolean overwriteIfExists;
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
     * Gets the value of the pathTarget property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPathTarget() {
        return pathTarget;
    }

    /**
     * Sets the value of the pathTarget property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPathTarget(String value) {
        this.pathTarget = value;
    }

    /**
     * Gets the value of the overwriteIfExists property.
     * 
     */
    public boolean isOverwriteIfExists() {
        return overwriteIfExists;
    }

    /**
     * Sets the value of the overwriteIfExists property.
     * 
     */
    public void setOverwriteIfExists(boolean value) {
        this.overwriteIfExists = value;
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
