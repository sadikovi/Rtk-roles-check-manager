
package oracle.bi.web.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetSubItemsParams complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetSubItemsParams">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="filter" type="{urn://oracle.bi.webservices/v6}GetSubItemsFilter"/>
 *         &lt;element name="includeACL" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="withPermission" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="withPermissionMask" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="withAttributes" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="withAttributesMask" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetSubItemsParams", propOrder = {
    "filter",
    "includeACL",
    "withPermission",
    "withPermissionMask",
    "withAttributes",
    "withAttributesMask"
})
public class GetSubItemsParams {

    @XmlElement(required = true, nillable = true)
    protected GetSubItemsFilter filter;
    protected boolean includeACL;
    protected int withPermission;
    protected int withPermissionMask;
    protected int withAttributes;
    protected int withAttributesMask;

    /**
     * Gets the value of the filter property.
     * 
     * @return
     *     possible object is
     *     {@link GetSubItemsFilter }
     *     
     */
    public GetSubItemsFilter getFilter() {
        return filter;
    }

    /**
     * Sets the value of the filter property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetSubItemsFilter }
     *     
     */
    public void setFilter(GetSubItemsFilter value) {
        this.filter = value;
    }

    /**
     * Gets the value of the includeACL property.
     * 
     */
    public boolean isIncludeACL() {
        return includeACL;
    }

    /**
     * Sets the value of the includeACL property.
     * 
     */
    public void setIncludeACL(boolean value) {
        this.includeACL = value;
    }

    /**
     * Gets the value of the withPermission property.
     * 
     */
    public int getWithPermission() {
        return withPermission;
    }

    /**
     * Sets the value of the withPermission property.
     * 
     */
    public void setWithPermission(int value) {
        this.withPermission = value;
    }

    /**
     * Gets the value of the withPermissionMask property.
     * 
     */
    public int getWithPermissionMask() {
        return withPermissionMask;
    }

    /**
     * Sets the value of the withPermissionMask property.
     * 
     */
    public void setWithPermissionMask(int value) {
        this.withPermissionMask = value;
    }

    /**
     * Gets the value of the withAttributes property.
     * 
     */
    public int getWithAttributes() {
        return withAttributes;
    }

    /**
     * Sets the value of the withAttributes property.
     * 
     */
    public void setWithAttributes(int value) {
        this.withAttributes = value;
    }

    /**
     * Gets the value of the withAttributesMask property.
     * 
     */
    public int getWithAttributesMask() {
        return withAttributesMask;
    }

    /**
     * Sets the value of the withAttributesMask property.
     * 
     */
    public void setWithAttributesMask(int value) {
        this.withAttributesMask = value;
    }

}
