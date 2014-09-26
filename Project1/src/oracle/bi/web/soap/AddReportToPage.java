
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
 *         &lt;element name="pageID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="reportID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="report" type="{urn://oracle.bi.webservices/v6}ReportRef"/>
 *         &lt;element name="reportViewName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="reportParams" type="{urn://oracle.bi.webservices/v6}ReportParams"/>
 *         &lt;element name="options" type="{urn://oracle.bi.webservices/v6}ReportHTMLOptions"/>
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
    "pageID",
    "reportID",
    "report",
    "reportViewName",
    "reportParams",
    "options",
    "sessionID"
})
@XmlRootElement(name = "addReportToPage")
public class AddReportToPage {

    @XmlElement(required = true)
    protected String pageID;
    @XmlElement(required = true)
    protected String reportID;
    @XmlElement(required = true)
    protected ReportRef report;
    @XmlElement(required = true, nillable = true)
    protected String reportViewName;
    @XmlElement(required = true, nillable = true)
    protected ReportParams reportParams;
    @XmlElement(required = true, nillable = true)
    protected ReportHTMLOptions options;
    @XmlElement(required = true, nillable = true)
    protected String sessionID;

    /**
     * Gets the value of the pageID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPageID() {
        return pageID;
    }

    /**
     * Sets the value of the pageID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPageID(String value) {
        this.pageID = value;
    }

    /**
     * Gets the value of the reportID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReportID() {
        return reportID;
    }

    /**
     * Sets the value of the reportID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReportID(String value) {
        this.reportID = value;
    }

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
     * Gets the value of the reportViewName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReportViewName() {
        return reportViewName;
    }

    /**
     * Sets the value of the reportViewName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReportViewName(String value) {
        this.reportViewName = value;
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
     * Gets the value of the options property.
     * 
     * @return
     *     possible object is
     *     {@link ReportHTMLOptions }
     *     
     */
    public ReportHTMLOptions getOptions() {
        return options;
    }

    /**
     * Sets the value of the options property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReportHTMLOptions }
     *     
     */
    public void setOptions(ReportHTMLOptions value) {
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
