
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
 *         &lt;element name="jobInfo" type="{urn://oracle.bi.webservices/v6}JobInfo"/>
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
    "jobInfo"
})
@XmlRootElement(name = "getCountsResult")
public class GetCountsResult {

    @XmlElement(required = true)
    protected JobInfo jobInfo;

    /**
     * Gets the value of the jobInfo property.
     * 
     * @return
     *     possible object is
     *     {@link JobInfo }
     *     
     */
    public JobInfo getJobInfo() {
        return jobInfo;
    }

    /**
     * Sets the value of the jobInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link JobInfo }
     *     
     */
    public void setJobInfo(JobInfo value) {
        this.jobInfo = value;
    }

}
