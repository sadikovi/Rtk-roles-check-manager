
package oracle.bi.web.soap;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.w3c.dom.Element;


/**
 * <p>Java class for JobInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="JobInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="jobStats" type="{urn://oracle.bi.webservices/v6}JobStats"/>
 *         &lt;element name="fileInfo" type="{urn://oracle.bi.webservices/v6}FileInfo" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="detailedInfo" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;any processContents='skip' maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "JobInfo", propOrder = {
    "jobStats",
    "fileInfo",
    "detailedInfo"
})
public class JobInfo {

    @XmlElement(required = true)
    protected JobStats jobStats;
    protected List<FileInfo> fileInfo;
    protected JobInfo.DetailedInfo detailedInfo;

    /**
     * Gets the value of the jobStats property.
     * 
     * @return
     *     possible object is
     *     {@link JobStats }
     *     
     */
    public JobStats getJobStats() {
        return jobStats;
    }

    /**
     * Sets the value of the jobStats property.
     * 
     * @param value
     *     allowed object is
     *     {@link JobStats }
     *     
     */
    public void setJobStats(JobStats value) {
        this.jobStats = value;
    }

    /**
     * Gets the value of the fileInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fileInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFileInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FileInfo }
     * 
     * 
     */
    public List<FileInfo> getFileInfo() {
        if (fileInfo == null) {
            fileInfo = new ArrayList<FileInfo>();
        }
        return this.fileInfo;
    }

    /**
     * Gets the value of the detailedInfo property.
     * 
     * @return
     *     possible object is
     *     {@link JobInfo.DetailedInfo }
     *     
     */
    public JobInfo.DetailedInfo getDetailedInfo() {
        return detailedInfo;
    }

    /**
     * Sets the value of the detailedInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link JobInfo.DetailedInfo }
     *     
     */
    public void setDetailedInfo(JobInfo.DetailedInfo value) {
        this.detailedInfo = value;
    }


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
     *         &lt;any processContents='skip' maxOccurs="unbounded" minOccurs="0"/>
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
        "any"
    })
    public static class DetailedInfo {

        @XmlAnyElement
        protected List<Element> any;

        /**
         * Gets the value of the any property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the any property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAny().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Element }
         * 
         * 
         */
        public List<Element> getAny() {
            if (any == null) {
                any = new ArrayList<Element>();
            }
            return this.any;
        }

    }

}
