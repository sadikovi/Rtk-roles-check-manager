
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
 *         &lt;element name="targetLevel" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="GUIDs" type="{urn://oracle.bi.webservices/v6}arrayOfGUIDs"/>
 *         &lt;element name="segmentPath" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sessionID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "targetLevel",
    "guiDs",
    "segmentPath",
    "sessionID"
})
@XmlRootElement(name = "deleteResultSet")
public class DeleteResultSet {

    @XmlElement(required = true)
    protected String targetLevel;
    @XmlElement(name = "GUIDs", required = true)
    protected ArrayOfGUIDs guiDs;
    protected String segmentPath;
    protected String sessionID;

    /**
     * Gets the value of the targetLevel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTargetLevel() {
        return targetLevel;
    }

    /**
     * Sets the value of the targetLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTargetLevel(String value) {
        this.targetLevel = value;
    }

    /**
     * Gets the value of the guiDs property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfGUIDs }
     *     
     */
    public ArrayOfGUIDs getGUIDs() {
        return guiDs;
    }

    /**
     * Sets the value of the guiDs property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfGUIDs }
     *     
     */
    public void setGUIDs(ArrayOfGUIDs value) {
        this.guiDs = value;
    }

    /**
     * Gets the value of the segmentPath property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSegmentPath() {
        return segmentPath;
    }

    /**
     * Sets the value of the segmentPath property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSegmentPath(String value) {
        this.segmentPath = value;
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
