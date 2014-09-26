
package oracle.bi.web.soap;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TemplateInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TemplateInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="templateForEach" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="templateIterator" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="instance" type="{urn://oracle.bi.webservices/v6}TemplateInfoInstance" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TemplateInfo", propOrder = {
    "templateForEach",
    "templateIterator",
    "instance"
})
public class TemplateInfo {

    @XmlElement(required = true)
    protected String templateForEach;
    @XmlElement(required = true)
    protected String templateIterator;
    protected List<TemplateInfoInstance> instance;

    /**
     * Gets the value of the templateForEach property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTemplateForEach() {
        return templateForEach;
    }

    /**
     * Sets the value of the templateForEach property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTemplateForEach(String value) {
        this.templateForEach = value;
    }

    /**
     * Gets the value of the templateIterator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTemplateIterator() {
        return templateIterator;
    }

    /**
     * Sets the value of the templateIterator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTemplateIterator(String value) {
        this.templateIterator = value;
    }

    /**
     * Gets the value of the instance property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the instance property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInstance().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TemplateInfoInstance }
     * 
     * 
     */
    public List<TemplateInfoInstance> getInstance() {
        if (instance == null) {
            instance = new ArrayList<TemplateInfoInstance>();
        }
        return this.instance;
    }

}
