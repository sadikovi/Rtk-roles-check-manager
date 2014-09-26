
package oracle.bi.web.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for StartPageParams complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StartPageParams">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="idsPrefix" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="dontUseHttpCookies" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StartPageParams", propOrder = {
    "idsPrefix",
    "dontUseHttpCookies"
})
public class StartPageParams {

    @XmlElement(required = true, nillable = true)
    protected String idsPrefix;
    @XmlElement(defaultValue = "false")
    protected boolean dontUseHttpCookies;

    /**
     * Gets the value of the idsPrefix property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdsPrefix() {
        return idsPrefix;
    }

    /**
     * Sets the value of the idsPrefix property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdsPrefix(String value) {
        this.idsPrefix = value;
    }

    /**
     * Gets the value of the dontUseHttpCookies property.
     * 
     */
    public boolean isDontUseHttpCookies() {
        return dontUseHttpCookies;
    }

    /**
     * Sets the value of the dontUseHttpCookies property.
     * 
     */
    public void setDontUseHttpCookies(boolean value) {
        this.dontUseHttpCookies = value;
    }

}
