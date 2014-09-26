
package oracle.bi.web.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ReportRef complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ReportRef">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="reportPath" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="reportXml" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReportRef", propOrder = {
    "reportPath",
    "reportXml"
})
public class ReportRef {

    @XmlElement(required = true, nillable = true)
    protected String reportPath;
    @XmlElement(required = true, nillable = true)
    protected String reportXml;

    /**
     * Gets the value of the reportPath property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReportPath() {
        return reportPath;
    }

    /**
     * Sets the value of the reportPath property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReportPath(String value) {
        this.reportPath = value;
    }

    /**
     * Gets the value of the reportXml property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReportXml() {
        return reportXml;
    }

    /**
     * Sets the value of the reportXml property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReportXml(String value) {
        this.reportXml = value;
    }

}
