
package oracle.bi.web.soap;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ReportParams complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ReportParams">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="filterExpressions" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="variables" type="{urn://oracle.bi.webservices/v6}Variable" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="nameValues" type="{urn://oracle.bi.webservices/v6}NameValuePair" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="templateInfos" type="{urn://oracle.bi.webservices/v6}TemplateInfo" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="viewName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReportParams", propOrder = {
    "filterExpressions",
    "variables",
    "nameValues",
    "templateInfos",
    "viewName"
})
public class ReportParams {

    protected List<String> filterExpressions;
    protected List<Variable> variables;
    protected List<NameValuePair> nameValues;
    protected List<TemplateInfo> templateInfos;
    protected String viewName;

    /**
     * Gets the value of the filterExpressions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the filterExpressions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFilterExpressions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getFilterExpressions() {
        if (filterExpressions == null) {
            filterExpressions = new ArrayList<String>();
        }
        return this.filterExpressions;
    }

    /**
     * Gets the value of the variables property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the variables property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVariables().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Variable }
     * 
     * 
     */
    public List<Variable> getVariables() {
        if (variables == null) {
            variables = new ArrayList<Variable>();
        }
        return this.variables;
    }

    /**
     * Gets the value of the nameValues property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the nameValues property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNameValues().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NameValuePair }
     * 
     * 
     */
    public List<NameValuePair> getNameValues() {
        if (nameValues == null) {
            nameValues = new ArrayList<NameValuePair>();
        }
        return this.nameValues;
    }

    /**
     * Gets the value of the templateInfos property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the templateInfos property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTemplateInfos().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TemplateInfo }
     * 
     * 
     */
    public List<TemplateInfo> getTemplateInfos() {
        if (templateInfos == null) {
            templateInfos = new ArrayList<TemplateInfo>();
        }
        return this.templateInfos;
    }

    /**
     * Gets the value of the viewName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getViewName() {
        return viewName;
    }

    /**
     * Sets the value of the viewName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setViewName(String value) {
        this.viewName = value;
    }

}
