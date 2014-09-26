package sitronics.data;

import java.util.ArrayList;
import java.util.List;

import oracle.bi.web.soap.Account;
import oracle.bi.web.soap.SecurityService;
import oracle.bi.web.soap.SecurityServiceSoap;

public class SOAPCheckRoles {
    public SOAPCheckRoles() {
        super();
    }
    
    public static List<String> getUserRoles(String sessionId, String checkName) {
        List<String> list = new ArrayList<String>();
        
        SecurityService securityService = new SecurityService();
        SecurityServiceSoap securityServiceSoap = securityService.getSecurityServiceSoap();
        
        // set search account
        Account account = new Account();
        account.setName(checkName);
        
        List<Account> users = new ArrayList<Account>();
        users.add(account);
        
        try {
        
            List<Account> output = securityServiceSoap.getGroups(users, true, sessionId);
            
            for (Account a : output) {
                String role = a.getName();
                list.add(role);
                
                role = null;
            }
        } catch (Exception e) {
            list.add("unknown user policies");
        }
        
        return list;
    }
}
