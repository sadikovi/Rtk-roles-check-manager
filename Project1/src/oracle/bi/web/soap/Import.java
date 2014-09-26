
package oracle.bi.web.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


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
 *         &lt;element name="flag" type="{urn://oracle.bi.webservices/v6}ImportFlags"/>
 *         &lt;element name="lastPurgedLog" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="updateReplicationLog" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="returnErrors" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="filter" type="{urn://oracle.bi.webservices/v6}CatalogItemsFilter"/>
 *         &lt;element name="pathMap" type="{urn://oracle.bi.webservices/v6}PathMap"/>
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
    "flag",
    "lastPurgedLog",
    "updateReplicationLog",
    "returnErrors",
    "filter",
    "pathMap",
    "sessionID"
})
@XmlRootElement(name = "import")
public class Import {

    @XmlElement(required = true)
    protected String filename;
    @XmlElement(required = true)
    protected ImportFlags flag;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastPurgedLog;
    protected boolean updateReplicationLog;
    protected boolean returnErrors;
    @XmlElement(required = true, nillable = true)
    protected CatalogItemsFilter filter;
    @XmlElement(required = true, nillable = true)
    protected PathMap pathMap;
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
     * Gets the value of the flag property.
     * 
     * @return
     *     possible object is
     *     {@link ImportFlags }
     *     
     */
    public ImportFlags getFlag() {
        return flag;
    }

    /**
     * Sets the value of the flag property.
     * 
     * @param value
     *     allowed object is
     *     {@link ImportFlags }
     *     
     */
    public void setFlag(ImportFlags value) {
        this.flag = value;
    }

    /**
     * Gets the value of the lastPurgedLog property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLastPurgedLog() {
        return lastPurgedLog;
    }

    /**
     * Sets the value of the lastPurgedLog property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLastPurgedLog(XMLGregorianCalendar value) {
        this.lastPurgedLog = value;
    }

    /**
     * Gets the value of the updateReplicationLog property.
     * 
     */
    public boolean isUpdateReplicationLog() {
        return updateReplicationLog;
    }

    /**
     * Sets the value of the updateReplicationLog property.
     * 
     */
    public void setUpdateReplicationLog(boolean value) {
        this.updateReplicationLog = value;
    }

    /**
     * Gets the value of the returnErrors property.
     * 
     */
    public boolean isReturnErrors() {
        return returnErrors;
    }

    /**
     * Sets the value of the returnErrors property.
     * 
     */
    public void setReturnErrors(boolean value) {
        this.returnErrors = value;
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
     * Gets the value of the pathMap property.
     * 
     * @return
     *     possible object is
     *     {@link PathMap }
     *     
     */
    public PathMap getPathMap() {
        return pathMap;
    }

    /**
     * Sets the value of the pathMap property.
     * 
     * @param value
     *     allowed object is
     *     {@link PathMap }
     *     
     */
    public void setPathMap(PathMap value) {
        this.pathMap = value;
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
