
package oracle.bi.web.soap;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ErrorDetailsLevel.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ErrorDetailsLevel">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ErrorCode"/>
 *     &lt;enumeration value="ErrorCodeAndText"/>
 *     &lt;enumeration value="FullDetails"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ErrorDetailsLevel")
@XmlEnum
public enum ErrorDetailsLevel {

    @XmlEnumValue("ErrorCode")
    ERROR_CODE("ErrorCode"),
    @XmlEnumValue("ErrorCodeAndText")
    ERROR_CODE_AND_TEXT("ErrorCodeAndText"),
    @XmlEnumValue("FullDetails")
    FULL_DETAILS("FullDetails");
    private final String value;

    ErrorDetailsLevel(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ErrorDetailsLevel fromValue(String v) {
        for (ErrorDetailsLevel c: ErrorDetailsLevel.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
