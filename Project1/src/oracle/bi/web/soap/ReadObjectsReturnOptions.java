
package oracle.bi.web.soap;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ReadObjectsReturnOptions.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ReadObjectsReturnOptions">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="NoObject"/>
 *     &lt;enumeration value="ObjectAsString"/>
 *     &lt;enumeration value="ObjectAsBinary"/>
 *     &lt;enumeration value="ObjectAsBinaryUseMtom"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ReadObjectsReturnOptions")
@XmlEnum
public enum ReadObjectsReturnOptions {

    @XmlEnumValue("NoObject")
    NO_OBJECT("NoObject"),
    @XmlEnumValue("ObjectAsString")
    OBJECT_AS_STRING("ObjectAsString"),
    @XmlEnumValue("ObjectAsBinary")
    OBJECT_AS_BINARY("ObjectAsBinary"),
    @XmlEnumValue("ObjectAsBinaryUseMtom")
    OBJECT_AS_BINARY_USE_MTOM("ObjectAsBinaryUseMtom");
    private final String value;

    ReadObjectsReturnOptions(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ReadObjectsReturnOptions fromValue(String v) {
        for (ReadObjectsReturnOptions c: ReadObjectsReturnOptions.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
