
package oracle.bi.web.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
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
 *         &lt;element name="conditionIsTrue" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
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
    "conditionIsTrue"
})
@XmlRootElement(name = "evaluateInlineConditionResult")
public class EvaluateInlineConditionResult {

    protected boolean conditionIsTrue;

    /**
     * Gets the value of the conditionIsTrue property.
     * 
     */
    public boolean isConditionIsTrue() {
        return conditionIsTrue;
    }

    /**
     * Sets the value of the conditionIsTrue property.
     * 
     */
    public void setConditionIsTrue(boolean value) {
        this.conditionIsTrue = value;
    }

}
