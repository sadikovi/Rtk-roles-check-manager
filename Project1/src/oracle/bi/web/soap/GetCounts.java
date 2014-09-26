
package oracle.bi.web.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
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
 *         &lt;element name="segmentPath" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="treePath" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="segmentationOptions" type="{urn://oracle.bi.webservices/v6}SegmentationOptions" minOccurs="0"/>
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
    "segmentPath",
    "treePath",
    "segmentationOptions",
    "sessionID"
})
@XmlRootElement(name = "getCounts")
public class GetCounts {

    protected String segmentPath;
    protected String treePath;
    protected SegmentationOptions segmentationOptions;
    protected String sessionID;

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
     * Gets the value of the treePath property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTreePath() {
        return treePath;
    }

    /**
     * Sets the value of the treePath property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTreePath(String value) {
        this.treePath = value;
    }

    /**
     * Gets the value of the segmentationOptions property.
     * 
     * @return
     *     possible object is
     *     {@link SegmentationOptions }
     *     
     */
    public SegmentationOptions getSegmentationOptions() {
        return segmentationOptions;
    }

    /**
     * Sets the value of the segmentationOptions property.
     * 
     * @param value
     *     allowed object is
     *     {@link SegmentationOptions }
     *     
     */
    public void setSegmentationOptions(SegmentationOptions value) {
        this.segmentationOptions = value;
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
