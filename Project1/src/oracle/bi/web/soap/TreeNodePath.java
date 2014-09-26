
package oracle.bi.web.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TreeNodePath complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TreeNodePath">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="treePath" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="treeNode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TreeNodePath", propOrder = {
    "treePath",
    "treeNode"
})
public class TreeNodePath {

    @XmlElement(required = true)
    protected String treePath;
    @XmlElement(required = true)
    protected String treeNode;

    /**
     * Gets the value of the treePath property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTreePath() {
        return treePath;
    }

    /**
     * Sets the value of the treePath property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTreePath(String value) {
        this.treePath = value;
    }

    /**
     * Gets the value of the treeNode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTreeNode() {
        return treeNode;
    }

    /**
     * Sets the value of the treeNode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTreeNode(String value) {
        this.treeNode = value;
    }

}
