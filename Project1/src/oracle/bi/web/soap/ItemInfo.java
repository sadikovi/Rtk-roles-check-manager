
package oracle.bi.web.soap;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * attributes field value is  a combination of the following flags:
 *                 1 - read only,
 *                 2 - archive,
 *                 4 - hidden,
 *                 8 - system,
 *                 16 - dont index
 * 
 * <p>Java class for ItemInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ItemInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="path" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="type" type="{urn://oracle.bi.webservices/v6}ItemInfoType"/>
 *         &lt;element name="caption" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="attributes" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="lastModified" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="created" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="accessed" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="creator" type="{urn://oracle.bi.webservices/v6}Account" minOccurs="0"/>
 *         &lt;element name="lastModifier" type="{urn://oracle.bi.webservices/v6}Account" minOccurs="0"/>
 *         &lt;element name="signature" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="targetPath" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="acl" type="{urn://oracle.bi.webservices/v6}ACL" minOccurs="0"/>
 *         &lt;element name="owner" type="{urn://oracle.bi.webservices/v6}Account" minOccurs="0"/>
 *         &lt;element name="itemProperties" type="{urn://oracle.bi.webservices/v6}NameValuePair" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ItemInfo", propOrder = {
    "path",
    "type",
    "caption",
    "attributes",
    "lastModified",
    "created",
    "accessed",
    "creator",
    "lastModifier",
    "signature",
    "targetPath",
    "acl",
    "owner",
    "itemProperties"
})
public class ItemInfo {

    @XmlElement(required = true)
    protected String path;
    @XmlElement(required = true)
    protected ItemInfoType type;
    protected String caption;
    protected Integer attributes;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastModified;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar created;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar accessed;
    protected Account creator;
    protected Account lastModifier;
    protected String signature;
    protected String targetPath;
    protected ACL acl;
    protected Account owner;
    protected List<NameValuePair> itemProperties;

    /**
     * Gets the value of the path property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPath() {
        return path;
    }

    /**
     * Sets the value of the path property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPath(String value) {
        this.path = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link ItemInfoType }
     *     
     */
    public ItemInfoType getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link ItemInfoType }
     *     
     */
    public void setType(ItemInfoType value) {
        this.type = value;
    }

    /**
     * Gets the value of the caption property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCaption() {
        return caption;
    }

    /**
     * Sets the value of the caption property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCaption(String value) {
        this.caption = value;
    }

    /**
     * Gets the value of the attributes property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getAttributes() {
        return attributes;
    }

    /**
     * Sets the value of the attributes property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setAttributes(Integer value) {
        this.attributes = value;
    }

    /**
     * Gets the value of the lastModified property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLastModified() {
        return lastModified;
    }

    /**
     * Sets the value of the lastModified property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLastModified(XMLGregorianCalendar value) {
        this.lastModified = value;
    }

    /**
     * Gets the value of the created property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCreated() {
        return created;
    }

    /**
     * Sets the value of the created property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCreated(XMLGregorianCalendar value) {
        this.created = value;
    }

    /**
     * Gets the value of the accessed property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getAccessed() {
        return accessed;
    }

    /**
     * Sets the value of the accessed property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setAccessed(XMLGregorianCalendar value) {
        this.accessed = value;
    }

    /**
     * Gets the value of the creator property.
     * 
     * @return
     *     possible object is
     *     {@link Account }
     *     
     */
    public Account getCreator() {
        return creator;
    }

    /**
     * Sets the value of the creator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Account }
     *     
     */
    public void setCreator(Account value) {
        this.creator = value;
    }

    /**
     * Gets the value of the lastModifier property.
     * 
     * @return
     *     possible object is
     *     {@link Account }
     *     
     */
    public Account getLastModifier() {
        return lastModifier;
    }

    /**
     * Sets the value of the lastModifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link Account }
     *     
     */
    public void setLastModifier(Account value) {
        this.lastModifier = value;
    }

    /**
     * Gets the value of the signature property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSignature() {
        return signature;
    }

    /**
     * Sets the value of the signature property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSignature(String value) {
        this.signature = value;
    }

    /**
     * Gets the value of the targetPath property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTargetPath() {
        return targetPath;
    }

    /**
     * Sets the value of the targetPath property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTargetPath(String value) {
        this.targetPath = value;
    }

    /**
     * Gets the value of the acl property.
     * 
     * @return
     *     possible object is
     *     {@link ACL }
     *     
     */
    public ACL getAcl() {
        return acl;
    }

    /**
     * Sets the value of the acl property.
     * 
     * @param value
     *     allowed object is
     *     {@link ACL }
     *     
     */
    public void setAcl(ACL value) {
        this.acl = value;
    }

    /**
     * Gets the value of the owner property.
     * 
     * @return
     *     possible object is
     *     {@link Account }
     *     
     */
    public Account getOwner() {
        return owner;
    }

    /**
     * Sets the value of the owner property.
     * 
     * @param value
     *     allowed object is
     *     {@link Account }
     *     
     */
    public void setOwner(Account value) {
        this.owner = value;
    }

    /**
     * Gets the value of the itemProperties property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the itemProperties property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getItemProperties().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NameValuePair }
     * 
     * 
     */
    public List<NameValuePair> getItemProperties() {
        if (itemProperties == null) {
            itemProperties = new ArrayList<NameValuePair>();
        }
        return this.itemProperties;
    }

}
