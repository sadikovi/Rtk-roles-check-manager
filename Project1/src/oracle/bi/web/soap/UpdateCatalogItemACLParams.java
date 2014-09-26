
package oracle.bi.web.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UpdateCatalogItemACLParams complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UpdateCatalogItemACLParams">
 *   &lt;complexContent>
 *     &lt;extension base="{urn://oracle.bi.webservices/v6}UpdateACLParams">
 *       &lt;sequence>
 *         &lt;element name="recursive" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UpdateCatalogItemACLParams", propOrder = {
    "recursive"
})
public class UpdateCatalogItemACLParams
    extends UpdateACLParams
{

    protected boolean recursive;

    /**
     * Gets the value of the recursive property.
     * 
     */
    public boolean isRecursive() {
        return recursive;
    }

    /**
     * Sets the value of the recursive property.
     * 
     */
    public void setRecursive(boolean value) {
        this.recursive = value;
    }

}
