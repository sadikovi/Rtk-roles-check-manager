
package oracle.bi.web.soap;

import java.math.BigInteger;
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
 *         &lt;element name="report" type="{urn://oracle.bi.webservices/v6}ReportRef" minOccurs="0"/>
 *         &lt;element name="reportParams" type="{urn://oracle.bi.webservices/v6}ReportParams" minOccurs="0"/>
 *         &lt;element name="segmentPath" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="treeNodePath" type="{urn://oracle.bi.webservices/v6}TreeNodePath" minOccurs="0"/>
 *         &lt;element name="segmentationOptions" type="{urn://oracle.bi.webservices/v6}SegmentationOptions" minOccurs="0"/>
 *         &lt;element name="filesystem" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="timeout" type="{http://www.w3.org/2001/XMLSchema}integer"/>
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
    "report",
    "reportParams",
    "segmentPath",
    "treeNodePath",
    "segmentationOptions",
    "filesystem",
    "timeout",
    "sessionID"
})
@XmlRootElement(name = "writeListFiles")
public class WriteListFiles {

    protected ReportRef report;
    protected ReportParams reportParams;
    protected String segmentPath;
    protected TreeNodePath treeNodePath;
    protected SegmentationOptions segmentationOptions;
    @XmlElement(required = true)
    protected String filesystem;
    @XmlElement(required = true)
    protected BigInteger timeout;
    protected String sessionID;

    /**
     * Gets the value of the report property.
     * 
     * @return
     *     possible object is
     *     {@link ReportRef }
     *     
     */
    public ReportRef getReport() {
        return report;
    }

    /**
     * Sets the value of the report property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReportRef }
     *     
     */
    public void setReport(ReportRef value) {
        this.report = value;
    }

    /**
     * Gets the value of the reportParams property.
     * 
     * @return
     *     possible object is
     *     {@link ReportParams }
     *     
     */
    public ReportParams getReportParams() {
        return reportParams;
    }

    /**
     * Sets the value of the reportParams property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReportParams }
     *     
     */
    public void setReportParams(ReportParams value) {
        this.reportParams = value;
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
     * Gets the value of the filesystem property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFilesystem() {
        return filesystem;
    }

    /**
     * Sets the value of the filesystem property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFilesystem(String value) {
        this.filesystem = value;
    }

    /**
     * Gets the value of the timeout property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTimeout() {
        return timeout;
    }

    /**
     * Sets the value of the timeout property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTimeout(BigInteger value) {
        this.timeout = value;
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
