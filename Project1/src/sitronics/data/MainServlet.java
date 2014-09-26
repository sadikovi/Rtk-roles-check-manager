package sitronics.data;

import java.io.IOException;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import javax.servlet.*;
import javax.servlet.http.*;

import sitronics.data.utils.AuthUtil;
import sitronics.data.utils.Consts;
import sitronics.data.utils.Error;

public class MainServlet extends HttpServlet {
    private static final String CONTENT_TYPE = "text/html; charset=windows-1251";
    @SuppressWarnings("compatibility:1979045398915064622")
    private static final long serialVersionUID = 1L;

    public void init(ServletConfig config) throws ServletException {
        super.init(config);
    }

    public void doGet(HttpServletRequest request,
                      HttpServletResponse response) throws ServletException,
                                                           IOException {
        response.setContentType(CONTENT_TYPE);
        
        String username = AuthUtil.getAuthenticatedUsername(request, Consts.BI_ANALYTICS_URL);
        
        try {
            if (username.length() > 0 && AuthUtil.checkUserRole(request, Consts.ACCESS_ROLE, Consts.BI_ANALYTICS_URL)) {
                String checkname = request.getParameter("user");
                
                String sessionId = AuthUtil.getUserID(request);
                
                String[] names = checkname.split(Consts.SEPARATOR);
                List<HashMap> info = new ArrayList<HashMap>();
                
                for (String checkName : names) {
                    HashMap rolesInfo = new HashMap();
                    
                    List<String> roles = SOAPCheckRoles.getUserRoles(sessionId, checkName);
                    
                    rolesInfo.put("USER", checkName);
                    rolesInfo.put("ROLES", roles);
                    
                    info.add(rolesInfo);
                    
                    roles = null;
                    checkname = null;
                    rolesInfo = null;   
                }
                
                String json = "{ \"info\" : [ ";
                
                if (info.size() > 0) {
                    for (HashMap r : info) {
                        String curUser = (String)r.get("USER");
                        List<String> curRoles = (List<String>)r.get("ROLES");
                        
                        json += "{ \"user\" : \"" + curUser + "\", \"roles\" : [ ";
                        
                        for (String curRole : curRoles) {
                            json += "{ \"role\" : \"" + curRole + "\" },";
                        }
                        
                        json = (json.endsWith(","))?json.substring(0,json.length()-1) : json;
                        
                        json += " ] },";
                    }
                    
                    json = (json.endsWith(","))?json.substring(0,json.length()-1) : json;
                    
                    json += " ] }";
                    
                    response.getWriter().println(json);
                    
                } else {
                    Error.thrown(response, "004", "Info is empty");
                }
                
                json = " ] }";
            } else {
                Error.thrown(response, "002", "Permission is denied");
            }
        } catch (Exception e) {
            Error.thrown(response, "003", e.toString());
        }
    }

    public void doPost(HttpServletRequest request,
                       HttpServletResponse response) throws ServletException,
                                                            IOException {
        response.setContentType(CONTENT_TYPE);
        Error.thrown(response, "001", "POST method is not supported");
    }
}
