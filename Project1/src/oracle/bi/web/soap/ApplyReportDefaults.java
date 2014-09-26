
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
 *         &lt;element name="reportRefs" type="{urn://oracle.bi.webservices/v6}ReportRef"/>
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
    "reportRefs",
    "sessionID"
})
@XmlRootElement(name = "applyReportDefaults")
public class ApplyReportDefaults {

    @XmlElement(required = true)
    protected ReportRef reportRefs;
    @XmlElement(required = true, nillable = true)
    protected String sessionID;

    /**
     * Gets the value of the reportRefs property.
     * 
     * @return
     *     possible object is
     *     {@link ReportRef }
     *     
     */
    public ReportRef getReportRefs() {
        return reportRefs;
    }

    /**
     * Sets the value of the reportRefs property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReportRef }
     *     
     */
    public void setReportRefs(ReportRef value) {
        this.reportRefs = value;
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
