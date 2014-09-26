
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
 *         &lt;element name="filename" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="filter" type="{urn://oracle.bi.webservices/v6}CatalogItemsFilter"/>
 *         &lt;element name="flag" type="{urn://oracle.bi.webservices/v6}ExportFlags"/>
 *         &lt;element name="exportSecurity" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
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
    "filename",
    "filter",
    "flag",
    "exportSecurity",
    "sessionID"
})
@XmlRootElement(name = "export")
public class Export {

    @XmlElement(required = true)
    protected String filename;
    @XmlElement(required = true)
    protected CatalogItemsFilter filter;
    @XmlElement(required = true)
    protected ExportFlags flag;
    @XmlElement(defaultValue = "true")
    protected boolean exportSecurity;
    @XmlElement(required = true, nillable = true)
    protected String sessionID;

    /**
     * Gets the value of the filename property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFilename() {
        return filename;
    }

    /**
     * Sets the value of the filename property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFilename(String value) {
        this.filename = value;
    }

    /**
     * Gets the value of the filter property.
     * 
     * @return
     *     possible object is
     *     {@link CatalogItemsFilter }
     *     
     */
    public CatalogItemsFilter getFilter() {
        return filter;
    }

    /**
     * Sets the value of the filter property.
     * 
     * @param value
     *     allowed object is
     *     {@link CatalogItemsFilter }
     *     
     */
    public void setFilter(CatalogItemsFilter value) {
        this.filter = value;
    }

    /**
     * Gets the value of the flag property.
     * 
     * @return
     *     possible object is
     *     {@link ExportFlags }
     *     
     */
    public ExportFlags getFlag() {
        return flag;
    }

    /**
     * Sets the value of the flag property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExportFlags }
     *     
     */
    public void setFlag(ExportFlags value) {
        this.flag = value;
    }

    /**
     * Gets the value of the exportSecurity property.
     * 
     */
    public boolean isExportSecurity() {
        return exportSecurity;
    }

    /**
     * Sets the value of the exportSecurity property.
     * 
     */
    public void setExportSecurity(boolean value) {
        this.exportSecurity = value;
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
