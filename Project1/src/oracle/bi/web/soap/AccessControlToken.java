
package oracle.bi.web.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * permissionMask field value is  combination of the following flags:
 *             1 permission to read items content
 *             2 permission to traverse directory
 *             4 permission to change items content
 *             8 permission to delete an item
 *             16 permission to assign permissions to others
 *             32 can take ownership of the item
 *             2048 permission to run a publisher report live
 *             4096 permission to schedule a publisher report
 *             8192 permission to view output of a publisher report
 * 
 * <p>Java class for AccessControlToken complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AccessControlToken">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="account" type="{urn://oracle.bi.webservices/v6}Account"/>
 *         &lt;element name="permissionMask" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AccessControlToken", propOrder = {
    "account",
    "permissionMask"
})
public class AccessControlToken {

    @XmlElement(required = true)
    protected Account account;
    protected int permissionMask;

    /**
     * Gets the value of the account property.
     * 
     * @return
     *     possible object is
     *     {@link Account }
     *     
     */
    public Account getAccount() {
        return account;
    }

    /**
     * Sets the value of the account property.
     * 
     * @param value
     *     allowed object is
     *     {@link Account }
     *     
     */
    public void setAccount(Account value) {
        this.account = value;
    }

    /**
     * Gets the value of the permissionMask property.
     * 
     */
    public int getPermissionMask() {
        return permissionMask;
    }

    /**
     * Sets the value of the permissionMask property.
     * 
     */
    public void setPermissionMask(int value) {
        this.permissionMask = value;
    }

}
