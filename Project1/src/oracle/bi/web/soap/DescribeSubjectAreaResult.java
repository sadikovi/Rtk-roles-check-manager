
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
 *         &lt;element name="subjectArea" type="{urn://oracle.bi.webservices/v6}SASubjectArea"/>
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
    "subjectArea"
})
@XmlRootElement(name = "describeSubjectAreaResult")
public class DescribeSubjectAreaResult {

    @XmlElement(required = true)
    protected SASubjectArea subjectArea;

    /**
     * Gets the value of the subjectArea property.
     * 
     * @return
     *     possible object is
     *     {@link SASubjectArea }
     *     
     */
    public SASubjectArea getSubjectArea() {
        return subjectArea;
    }

    /**
     * Sets the value of the subjectArea property.
     * 
     * @param value
     *     allowed object is
     *     {@link SASubjectArea }
     *     
     */
    public void setSubjectArea(SASubjectArea value) {
        this.subjectArea = value;
    }

}
