package sitronics.data.utils;

import java.io.File;

import java.net.MalformedURLException;
import java.net.URL;

import javax.xml.namespace.QName;

import oracle.bi.web.soap.SAWSessionService;


public class BIService {
    /*
     * If you do not have a class which contains the BI_ANALYTICS_URL constant
     * [Scheme + :// + ServerName + : + ServerPort], for instance "http://msk-02-orabits.tsretail.ru:9704"
     * then you have to declare a constant with appropriate reference to bi server here
     * for instance, static String BI_ANALYTICS_URL = "http://msk-02-orabits.tsretail.ru:9704"
     */
    
    public BIService() {
        super();
    }
    
    /**
     * Method returns server address for wsdl as URL type.
     * 
     * @param biServerURL
     * @return URL wsdlLocation
     */
    public static URL getWSDLLocationURL(String biServerURL)  {
        String wsdlLocation = null;
        if (biServerURL == null || biServerURL.length() <= 0) {
            wsdlLocation = Consts.BI_ANALYTICS_URL + "/analytics/" + "saw.dll/wsdl/v6";
        } else {
            wsdlLocation = biServerURL + "/analytics/" + "saw.dll/wsdl/v6";
        }
        
        URL wsdlLocationURL = SAWSessionService.class.getResource(wsdlLocation);
        try {
            if (wsdlLocationURL == null) {
              URL baseUrl = new File(".").toURL();
              wsdlLocationURL = new URL(baseUrl, wsdlLocation);
            }
        } catch (MalformedURLException e) {
            //Failed to create wsdlLocationURL
            e.printStackTrace();
        }
        
        return wsdlLocationURL;
    }
    
    /**
     * Method returns QName for bi server.
     * 
     * @param service
     * @return
     */
    public static QName getQName(String service)  {
        /*try services 
         * MetadataService
         * SAWSessionService
         * SecurityService
         */
        QName qName = new QName("urn://oracle.bi.webservices/v6", service);
        
        return qName;
    }
}
