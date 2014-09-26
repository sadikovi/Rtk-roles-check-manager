
package oracle.bi.web.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for XMLQueryExecutionOptions complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="XMLQueryExecutionOptions">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="async" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="maxRowsPerPage" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="refresh" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="presentationInfo" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="type" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "XMLQueryExecutionOptions", propOrder = {
    "async",
    "maxRowsPerPage",
    "refresh",
    "presentationInfo",
    "type"
})
public class XMLQueryExecutionOptions {

    protected boolean async;
    protected int maxRowsPerPage;
    protected boolean refresh;
    protected boolean presentationInfo;
    @XmlElement(required = true, nillable = true)
    protected String type;

    /**
     * Gets the value of the async property.
     * 
     */
    public boolean isAsync() {
        return async;
    }

    /**
     * Sets the value of the async property.
     * 
     */
    public void setAsync(boolean value) {
        this.async = value;
    }

    /**
     * Gets the value of the maxRowsPerPage property.
     * 
     */
    public int getMaxRowsPerPage() {
        return maxRowsPerPage;
    }

    /**
     * Sets the value of the maxRowsPerPage property.
     * 
     */
    public void setMaxRowsPerPage(int value) {
        this.maxRowsPerPage = value;
    }

    /**
     * Gets the value of the refresh property.
     * 
     */
    public boolean isRefresh() {
        return refresh;
    }

    /**
     * Sets the value of the refresh property.
     * 
     */
    public void setRefresh(boolean value) {
        this.refresh = value;
    }

    /**
     * Gets the value of the presentationInfo property.
     * 
     */
    public boolean isPresentationInfo() {
        return presentationInfo;
    }

    /**
     * Sets the value of the presentationInfo property.
     * 
     */
    public void setPresentationInfo(boolean value) {
        this.presentationInfo = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
    }

}
