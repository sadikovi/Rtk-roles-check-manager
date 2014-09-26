
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
 *         &lt;element name="privilegeName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="acl" type="{urn://oracle.bi.webservices/v6}ACL"/>
 *         &lt;element name="updateACLParams" type="{urn://oracle.bi.webservices/v6}UpdateACLParams"/>
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
    "privilegeName",
    "acl",
    "updateACLParams",
    "sessionID"
})
@XmlRootElement(name = "updateGlobalPrivilegeACL")
public class UpdateGlobalPrivilegeACL {

    @XmlElement(required = true)
    protected String privilegeName;
    @XmlElement(required = true)
    protected ACL acl;
    @XmlElement(required = true, nillable = true)
    protected UpdateACLParams updateACLParams;
    @XmlElement(required = true, nillable = true)
    protected String sessionID;

    /**
     * Gets the value of the privilegeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrivilegeName() {
        return privilegeName;
    }

    /**
     * Sets the value of the privilegeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrivilegeName(String value) {
        this.privilegeName = value;
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
     * Gets the value of the updateACLParams property.
     * 
     * @return
     *     possible object is
     *     {@link UpdateACLParams }
     *     
     */
    public UpdateACLParams getUpdateACLParams() {
        return updateACLParams;
    }

    /**
     * Sets the value of the updateACLParams property.
     * 
     * @param value
     *     allowed object is
     *     {@link UpdateACLParams }
     *     
     */
    public void setUpdateACLParams(UpdateACLParams value) {
        this.updateACLParams = value;
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
