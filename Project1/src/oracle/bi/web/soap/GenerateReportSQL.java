
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
 *         &lt;element name="reportRef" type="{urn://oracle.bi.webservices/v6}ReportRef"/>
 *         &lt;element name="reportParams" type="{urn://oracle.bi.webservices/v6}ReportParams"/>
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
    "reportRef",
    "reportParams",
    "sessionID"
})
@XmlRootElement(name = "generateReportSQL")
public class GenerateReportSQL {

    @XmlElement(required = true)
    protected ReportRef reportRef;
    @XmlElement(required = true, nillable = true)
    protected ReportParams reportParams;
    @XmlElement(required = true, nillable = true)
    protected String sessionID;

    /**
     * Gets the value of the reportRef property.
     * 
     * @return
     *     possible object is
     *     {@link ReportRef }
     *     
     */
    public ReportRef getReportRef() {
        return reportRef;
    }

    /**
     * Sets the value of the reportRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReportRef }
     *     
     */
    public void setReportRef(ReportRef value) {
        this.reportRef = value;
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
