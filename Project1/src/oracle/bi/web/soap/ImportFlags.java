
package oracle.bi.web.soap;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ImportFlags.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ImportFlags">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="processLocalChanges"/>
 *     &lt;enumeration value="processRemoteChanges"/>
 *     &lt;enumeration value="processAllChanges"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ImportFlags")
@XmlEnum
public enum ImportFlags {

    @XmlEnumValue("processLocalChanges")
    PROCESS_LOCAL_CHANGES("processLocalChanges"),
    @XmlEnumValue("processRemoteChanges")
    PROCESS_REMOTE_CHANGES("processRemoteChanges"),
    @XmlEnumValue("processAllChanges")
    PROCESS_ALL_CHANGES("processAllChanges");
    private final String value;

    ImportFlags(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ImportFlags fromValue(String v) {
        for (ImportFlags c: ImportFlags.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
