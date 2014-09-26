
package oracle.bi.web.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SAColumn complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SAColumn">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="displayName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="nullable" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="dataType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="aggregatable" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="aggrRule" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SAColumn", propOrder = {
    "name",
    "displayName",
    "description",
    "nullable",
    "dataType",
    "aggregatable",
    "aggrRule"
})
public class SAColumn {

    @XmlElement(required = true)
    protected String name;
    @XmlElement(required = true)
    protected String displayName;
    @XmlElement(required = true)
    protected String description;
    protected boolean nullable;
    @XmlElement(required = true)
    protected String dataType;
    protected boolean aggregatable;
    @XmlElement(required = true)
    protected String aggrRule;

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the displayName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDisplayName() {
        return displayName;
    }

    /**
     * Sets the value of the displayName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDisplayName(String value) {
        this.displayName = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the nullable property.
     * 
     */
    public boolean isNullable() {
        return nullable;
    }

    /**
     * Sets the value of the nullable property.
     * 
     */
    public void setNullable(boolean value) {
        this.nullable = value;
    }

    /**
     * Gets the value of the dataType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataType() {
        return dataType;
    }

    /**
     * Sets the value of the dataType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataType(String value) {
        this.dataType = value;
    }

    /**
     * Gets the value of the aggregatable property.
     * 
     */
    public boolean isAggregatable() {
        return aggregatable;
    }

    /**
     * Sets the value of the aggregatable property.
     * 
     */
    public void setAggregatable(boolean value) {
        this.aggregatable = value;
    }

    /**
     * Gets the value of the aggrRule property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAggrRule() {
        return aggrRule;
    }

    /**
     * Sets the value of the aggrRule property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAggrRule(String value) {
        this.aggrRule = value;
    }

}
