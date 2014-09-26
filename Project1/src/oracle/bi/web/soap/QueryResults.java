
package oracle.bi.web.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for QueryResults complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="QueryResults">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="rowset" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="queryID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="finished" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QueryResults", propOrder = {
    "rowset",
    "queryID",
    "finished"
})
public class QueryResults {

    @XmlElement(required = true)
    protected String rowset;
    @XmlElement(required = true)
    protected String queryID;
    protected boolean finished;

    /**
     * Gets the value of the rowset property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRowset() {
        return rowset;
    }

    /**
     * Sets the value of the rowset property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRowset(String value) {
        this.rowset = value;
    }

    /**
     * Gets the value of the queryID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQueryID() {
        return queryID;
    }

    /**
     * Sets the value of the queryID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQueryID(String value) {
        this.queryID = value;
    }

    /**
     * Gets the value of the finished property.
     * 
     */
    public boolean isFinished() {
        return finished;
    }

    /**
     * Sets the value of the finished property.
     * 
     */
    public void setFinished(boolean value) {
        this.finished = value;
    }

}
