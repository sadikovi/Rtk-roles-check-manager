
package oracle.bi.web.soap;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for JobStats complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="JobStats">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="jobID" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="jobType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="jobUser" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="jobState">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="Running"/>
 *               &lt;enumeration value="Finished"/>
 *               &lt;enumeration value="Error"/>
 *               &lt;enumeration value="Queued"/>
 *               &lt;enumeration value="Cancelled"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="jobTotalMilliSec" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="jobStartedTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="jobFinishedTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="jobIsCancelling" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="exception" type="{urn://oracle.bi.webservices/v6}SAWException" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "JobStats", propOrder = {
    "jobID",
    "jobType",
    "jobUser",
    "jobState",
    "jobTotalMilliSec",
    "jobStartedTime",
    "jobFinishedTime",
    "jobIsCancelling",
    "exception"
})
public class JobStats {

    @XmlElement(required = true)
    protected BigInteger jobID;
    @XmlElement(required = true)
    protected String jobType;
    @XmlElement(required = true)
    protected String jobUser;
    @XmlElement(required = true)
    protected String jobState;
    @XmlElement(required = true)
    protected String jobTotalMilliSec;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar jobStartedTime;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar jobFinishedTime;
    @XmlElement(required = true)
    protected String jobIsCancelling;
    protected SAWException exception;

    /**
     * Gets the value of the jobID property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getJobID() {
        return jobID;
    }

    /**
     * Sets the value of the jobID property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setJobID(BigInteger value) {
        this.jobID = value;
    }

    /**
     * Gets the value of the jobType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJobType() {
        return jobType;
    }

    /**
     * Sets the value of the jobType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJobType(String value) {
        this.jobType = value;
    }

    /**
     * Gets the value of the jobUser property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJobUser() {
        return jobUser;
    }

    /**
     * Sets the value of the jobUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJobUser(String value) {
        this.jobUser = value;
    }

    /**
     * Gets the value of the jobState property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJobState() {
        return jobState;
    }

    /**
     * Sets the value of the jobState property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJobState(String value) {
        this.jobState = value;
    }

    /**
     * Gets the value of the jobTotalMilliSec property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJobTotalMilliSec() {
        return jobTotalMilliSec;
    }

    /**
     * Sets the value of the jobTotalMilliSec property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJobTotalMilliSec(String value) {
        this.jobTotalMilliSec = value;
    }

    /**
     * Gets the value of the jobStartedTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getJobStartedTime() {
        return jobStartedTime;
    }

    /**
     * Sets the value of the jobStartedTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setJobStartedTime(XMLGregorianCalendar value) {
        this.jobStartedTime = value;
    }

    /**
     * Gets the value of the jobFinishedTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getJobFinishedTime() {
        return jobFinishedTime;
    }

    /**
     * Sets the value of the jobFinishedTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setJobFinishedTime(XMLGregorianCalendar value) {
        this.jobFinishedTime = value;
    }

    /**
     * Gets the value of the jobIsCancelling property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJobIsCancelling() {
        return jobIsCancelling;
    }

    /**
     * Sets the value of the jobIsCancelling property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJobIsCancelling(String value) {
        this.jobIsCancelling = value;
    }

    /**
     * Gets the value of the exception property.
     * 
     * @return
     *     possible object is
     *     {@link SAWException }
     *     
     */
    public SAWException getException() {
        return exception;
    }

    /**
     * Sets the value of the exception property.
     * 
     * @param value
     *     allowed object is
     *     {@link SAWException }
     *     
     */
    public void setException(SAWException value) {
        this.exception = value;
    }

}
