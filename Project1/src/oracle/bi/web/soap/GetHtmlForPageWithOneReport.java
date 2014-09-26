
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
 *         &lt;element name="reportID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="report" type="{urn://oracle.bi.webservices/v6}ReportRef"/>
 *         &lt;element name="reportViewName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="reportParams" type="{urn://oracle.bi.webservices/v6}ReportParams"/>
 *         &lt;element name="reportOptions" type="{urn://oracle.bi.webservices/v6}ReportHTMLOptions"/>
 *         &lt;element name="pageParams" type="{urn://oracle.bi.webservices/v6}StartPageParams"/>
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
    "reportID",
    "report",
    "reportViewName",
    "reportParams",
    "reportOptions",
    "pageParams",
    "sessionID"
})
@XmlRootElement(name = "getHtmlForPageWithOneReport")
public class GetHtmlForPageWithOneReport {

    @XmlElement(required = true)
    protected String reportID;
    @XmlElement(required = true)
    protected ReportRef report;
    @XmlElement(required = true, nillable = true)
    protected String reportViewName;
    @XmlElement(required = true, nillable = true)
    protected ReportParams reportParams;
    @XmlElement(required = true, nillable = true)
    protected ReportHTMLOptions reportOptions;
    @XmlElement(required = true, nillable = true)
    protected StartPageParams pageParams;
    @XmlElement(required = true, nillable = true)
    protected String sessionID;

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
     * Gets the value of the reportOptions property.
     * 
     * @return
     *     possible object is
     *     {@link ReportHTMLOptions }
     *     
     */
    public ReportHTMLOptions getReportOptions() {
        return reportOptions;
    }

    /**
     * Sets the value of the reportOptions property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReportHTMLOptions }
     *     
     */
    public void setReportOptions(ReportHTMLOptions value) {
        this.reportOptions = value;
    }

    /**
     * Gets the value of the pageParams property.
     * 
     * @return
     *     possible object is
     *     {@link StartPageParams }
     *     
     */
    public StartPageParams getPageParams() {
        return pageParams;
    }

    /**
     * Sets the value of the pageParams property.
     * 
     * @param value
     *     allowed object is
     *     {@link StartPageParams }
     *     
     */
    public void setPageParams(StartPageParams value) {
        this.pageParams = value;
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
