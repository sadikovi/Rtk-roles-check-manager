
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
 *         &lt;element name="subjectAreaName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="detailsLevel" type="{urn://oracle.bi.webservices/v6}SASubjectAreaDetails"/>
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
    "subjectAreaName",
    "detailsLevel",
    "sessionID"
})
@XmlRootElement(name = "describeSubjectArea")
public class DescribeSubjectArea {

    @XmlElement(required = true)
    protected String subjectAreaName;
    @XmlElement(required = true)
    protected SASubjectAreaDetails detailsLevel;
    @XmlElement(required = true, nillable = true)
    protected String sessionID;

    /**
     * Gets the value of the subjectAreaName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubjectAreaName() {
        return subjectAreaName;
    }

    /**
     * Sets the value of the subjectAreaName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubjectAreaName(String value) {
        this.subjectAreaName = value;
    }

    /**
     * Gets the value of the detailsLevel property.
     * 
     * @return
     *     possible object is
     *     {@link SASubjectAreaDetails }
     *     
     */
    public SASubjectAreaDetails getDetailsLevel() {
        return detailsLevel;
    }

    /**
     * Sets the value of the detailsLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link SASubjectAreaDetails }
     *     
     */
    public void setDetailsLevel(SASubjectAreaDetails value) {
        this.detailsLevel = value;
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
