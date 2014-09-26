
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
 *         &lt;element name="sql" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="outputFormat" type="{urn://oracle.bi.webservices/v6}XMLQueryOutputFormat"/>
 *         &lt;element name="executionOptions" type="{urn://oracle.bi.webservices/v6}XMLQueryExecutionOptions"/>
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
    "sql",
    "outputFormat",
    "executionOptions",
    "sessionID"
})
@XmlRootElement(name = "executeSQLQuery")
public class ExecuteSQLQuery {

    @XmlElement(required = true)
    protected String sql;
    @XmlElement(required = true)
    protected XMLQueryOutputFormat outputFormat;
    @XmlElement(required = true, nillable = true)
    protected XMLQueryExecutionOptions executionOptions;
    @XmlElement(required = true, nillable = true)
    protected String sessionID;

    /**
     * Gets the value of the sql property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSql() {
        return sql;
    }

    /**
     * Sets the value of the sql property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSql(String value) {
        this.sql = value;
    }

    /**
     * Gets the value of the outputFormat property.
     * 
     * @return
     *     possible object is
     *     {@link XMLQueryOutputFormat }
     *     
     */
    public XMLQueryOutputFormat getOutputFormat() {
        return outputFormat;
    }

    /**
     * Sets the value of the outputFormat property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLQueryOutputFormat }
     *     
     */
    public void setOutputFormat(XMLQueryOutputFormat value) {
        this.outputFormat = value;
    }

    /**
     * Gets the value of the executionOptions property.
     * 
     * @return
     *     possible object is
     *     {@link XMLQueryExecutionOptions }
     *     
     */
    public XMLQueryExecutionOptions getExecutionOptions() {
        return executionOptions;
    }

    /**
     * Sets the value of the executionOptions property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLQueryExecutionOptions }
     *     
     */
    public void setExecutionOptions(XMLQueryExecutionOptions value) {
        this.executionOptions = value;
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
