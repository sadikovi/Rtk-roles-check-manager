
package oracle.bi.web.soap;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ReportHTMLLinksMode.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ReportHTMLLinksMode">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="SamePage"/>
 *     &lt;enumeration value="NewPage"/>
 *     &lt;enumeration value="InPlace"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ReportHTMLLinksMode")
@XmlEnum
public enum ReportHTMLLinksMode {

    @XmlEnumValue("SamePage")
    SAME_PAGE("SamePage"),
    @XmlEnumValue("NewPage")
    NEW_PAGE("NewPage"),
    @XmlEnumValue("InPlace")
    IN_PLACE("InPlace");
    private final String value;

    ReportHTMLLinksMode(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ReportHTMLLinksMode fromValue(String v) {
        for (ReportHTMLLinksMode c: ReportHTMLLinksMode.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
