
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
 *         &lt;element name="segmentPath" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="treeNodePath" type="{urn://oracle.bi.webservices/v6}TreeNodePath" minOccurs="0"/>
 *         &lt;element name="savedSegmentPath" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="segmentationOptions" type="{urn://oracle.bi.webservices/v6}SegmentationOptions" minOccurs="0"/>
 *         &lt;element name="SRCustomLabel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="appendStaticSegment" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
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
    "treeNodePath",
    "savedSegmentPath",
    "segmentationOptions",
    "srCustomLabel",
    "appendStaticSegment",
    "sessionID"
})
@XmlRootElement(name = "saveResultSet")
public class SaveResultSet {

    protected String segmentPath;
    protected TreeNodePath treeNodePath;
    protected String savedSegmentPath;
    protected SegmentationOptions segmentationOptions;
    @XmlElement(name = "SRCustomLabel")
    protected String srCustomLabel;
    @XmlElement(defaultValue = "false")
    protected Boolean appendStaticSegment;
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
     * Gets the value of the treeNodePath property.
     * 
     * @return
     *     possible object is
     *     {@link TreeNodePath }
     *     
     */
    public TreeNodePath getTreeNodePath() {
        return treeNodePath;
    }

    /**
     * Sets the value of the treeNodePath property.
     * 
     * @param value
     *     allowed object is
     *     {@link TreeNodePath }
     *     
     */
    public void setTreeNodePath(TreeNodePath value) {
        this.treeNodePath = value;
    }

    /**
     * Gets the value of the savedSegmentPath property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSavedSegmentPath() {
        return savedSegmentPath;
    }

    /**
     * Sets the value of the savedSegmentPath property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSavedSegmentPath(String value) {
        this.savedSegmentPath = value;
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
     * Gets the value of the srCustomLabel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSRCustomLabel() {
        return srCustomLabel;
    }

    /**
     * Sets the value of the srCustomLabel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSRCustomLabel(String value) {
        this.srCustomLabel = value;
    }

    /**
     * Gets the value of the appendStaticSegment property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAppendStaticSegment() {
        return appendStaticSegment;
    }

    /**
     * Sets the value of the appendStaticSegment property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAppendStaticSegment(Boolean value) {
        this.appendStaticSegment = value;
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
