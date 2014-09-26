package sitronics.data.utils;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;

import oracle.bi.web.soap.SAWSessionService;
import oracle.bi.web.soap.SAWSessionServiceSoap;


/**
 * Created by IntelliJ IDEA.
 * User: jardevbox
 * Date: 12/20/11
 * Time: 4:48 PM
 * To change this template use File | Settings | File Templates.
 */
public class AuthUtil {

    public static final String USER_ID_PARAM_NAME = "ORA_BIPS_NQID";
    
    /**
     * @param request
     * @return
     */
    public static String getAuthenticatedUsername(HttpServletRequest request, String biServerURL) {
        // first check if user authenticated
        String userID = null;

        // get user ID
        Cookie[] cookies = request.getCookies();
        for (Cookie cookie : cookies) {
            String cookieStr =
                cookie.getName() + " | " + cookie.getValue() + " | " +
                cookie.getDomain() + " | " + cookie.getPath();
            if (AuthUtil.USER_ID_PARAM_NAME.equals(cookie.getName())) {
                userID = cookie.getValue();
            }
        }

        // get username
        if (userID != null && userID.length() > 0) {
            try {
                SAWSessionService sAWSessionService;
                if (biServerURL == null || biServerURL.length() <= 0) {
                    sAWSessionService = new SAWSessionService();
                } else {
                    sAWSessionService = new SAWSessionService(BIService.getWSDLLocationURL(biServerURL), BIService.getQName("SAWSessionService"));
                }
                
                SAWSessionServiceSoap sAWSessionServiceSoap =
                    sAWSessionService.getSAWSessionServiceSoap();

                return sAWSessionServiceSoap.getCurUser(userID);
            } catch (Exception e) {
                System.err.println("Unauthorised user tried to access.");
                e.printStackTrace();
            }
        }

        return null;
    }
    
    public static String getCurrentUser(String sessionId, String biServerURL) {
        // get username
        if (sessionId != null && sessionId.length() > 0) {
            try {
                SAWSessionService sAWSessionService;
                if (biServerURL == null || biServerURL.length() <= 0) {
                    sAWSessionService = new SAWSessionService();
                } else {
                    sAWSessionService = new SAWSessionService(BIService.getWSDLLocationURL(biServerURL), BIService.getQName("SAWSessionService"));
                }
                
                SAWSessionServiceSoap sAWSessionServiceSoap =
                    sAWSessionService.getSAWSessionServiceSoap();

                return sAWSessionServiceSoap.getCurUser(sessionId);
            } catch (Exception e) {
                System.err.println("Unauthorised user tried to access.");
                e.printStackTrace();
            }
        }
        return "";
    }
    /**
     * @param request
     * @param roleName
     * @return
     */
    public static boolean checkUserRole(HttpServletRequest request,
                                        String roleName, String biServerURL) {
        if (roleName == null || roleName.equals(""))
            return false;

        // first check if user authenticated
        String userID = AuthUtil.getUserID(request);

        if (userID != null && userID.length() > 0) {
            try {
                SAWSessionService sAWSessionService;
                if (biServerURL == null || biServerURL.length() <= 0) {
                    sAWSessionService = new SAWSessionService();
                } else {
                    sAWSessionService = new SAWSessionService(BIService.getWSDLLocationURL(biServerURL), BIService.getQName("SAWSessionService"));
                }
                
                SAWSessionServiceSoap sAWSessionServiceSoap =
                    sAWSessionService.getSAWSessionServiceSoap();

                List<String> params = new ArrayList<String>();
                params.add("NQ_SESSION.GROUP");

                String[] groups =
                    sAWSessionServiceSoap.getSessionVariables(params,
                                                              userID).get(0).split(";");
                for (int i = 0; i < groups.length; i++)
                    if (groups[i].equals(roleName))
                        return true;
            } catch (Exception e) {
                System.err.println("Unauthorised user tried to access.");
                e.printStackTrace();
            }
        }

        return false;
    }
    
    
    public static String getUserRoles(HttpServletRequest request, String biServerURL) {
        String userID = AuthUtil.getUserID(request);

        if (userID != null && userID.length() > 0) {
            try {
                SAWSessionService sAWSessionService;
                if (biServerURL == null || biServerURL.length() <= 0) {
                    sAWSessionService = new SAWSessionService();
                } else {
                    sAWSessionService = new SAWSessionService(BIService.getWSDLLocationURL(biServerURL), BIService.getQName("SAWSessionService"));
                }
                SAWSessionServiceSoap sAWSessionServiceSoap =
                    sAWSessionService.getSAWSessionServiceSoap();

                List<String> params = new ArrayList<String>();
                params.add("NQ_SESSION.GROUP");

                return sAWSessionServiceSoap.getSessionVariables(params,
                                                                 userID).get(0);
            } catch (Exception e) {
                System.err.println("Unauthorised user tried to access.");
                e.printStackTrace();
            }
        }

        return "";
    }


    public static boolean isAuthenticated(HttpServletRequest request, String biServerURL) {
        String username = AuthUtil.getAuthenticatedUsername(request, biServerURL);
        return !(username == null || username.length() == 0);
    }

    public static String getUserID(HttpServletRequest request) {
        // first check if user authenticated
        String userID = null;

        // get user ID
        Cookie[] cookies = request.getCookies();
        for (Cookie cookie : cookies) {
            String cookieStr =
                cookie.getName() + " | " + cookie.getValue() + " | " +
                cookie.getDomain() + " | " + cookie.getPath();
            if (AuthUtil.USER_ID_PARAM_NAME.equals(cookie.getName())) {
                userID = cookie.getValue();
            }
        }

        return userID;
    }
}