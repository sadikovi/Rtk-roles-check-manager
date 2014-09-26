
package oracle.bi.web.soap;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SATableDetails.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SATableDetails">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Minimum"/>
 *     &lt;enumeration value="IncludeColumns"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "SATableDetails")
@XmlEnum
public enum SATableDetails {

    @XmlEnumValue("Minimum")
    MINIMUM("Minimum"),
    @XmlEnumValue("IncludeColumns")
    INCLUDE_COLUMNS("IncludeColumns");
    private final String value;

    SATableDetails(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SATableDetails fromValue(String v) {
        for (SATableDetails c: SATableDetails.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
