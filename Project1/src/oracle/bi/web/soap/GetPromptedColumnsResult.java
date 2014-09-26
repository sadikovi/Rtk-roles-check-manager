
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
 *         &lt;element name="ColumnInfo" type="{urn://oracle.bi.webservices/v6}PromptedColumnInfo"/>
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
    "columnInfo"
})
@XmlRootElement(name = "getPromptedColumnsResult")
public class GetPromptedColumnsResult {

    @XmlElement(name = "ColumnInfo", required = true)
    protected PromptedColumnInfo columnInfo;

    /**
     * Gets the value of the columnInfo property.
     * 
     * @return
     *     possible object is
     *     {@link PromptedColumnInfo }
     *     
     */
    public PromptedColumnInfo getColumnInfo() {
        return columnInfo;
    }

    /**
     * Sets the value of the columnInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link PromptedColumnInfo }
     *     
     */
    public void setColumnInfo(PromptedColumnInfo value) {
        this.columnInfo = value;
    }

}
