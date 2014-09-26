
package oracle.bi.web.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ReportHTMLOptions complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ReportHTMLOptions">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="enableDelayLoading" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="linkMode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReportHTMLOptions", propOrder = {
    "enableDelayLoading",
    "linkMode"
})
public class ReportHTMLOptions {

    protected boolean enableDelayLoading;
    @XmlElement(required = true)
    protected String linkMode;

    /**
     * Gets the value of the enableDelayLoading property.
     * 
     */
    public boolean isEnableDelayLoading() {
        return enableDelayLoading;
    }

    /**
     * Sets the value of the enableDelayLoading property.
     * 
     */
    public void setEnableDelayLoading(boolean value) {
        this.enableDelayLoading = value;
    }

    /**
     * Gets the value of the linkMode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLinkMode() {
        return linkMode;
    }

    /**
     * Sets the value of the linkMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLinkMode(String value) {
        this.linkMode = value;
    }

}
