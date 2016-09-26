package net.diaz.web.action;

import com.opensymphony.xwork2.ActionSupport;

import net.diaz.web.dao.UserDAO;
import net.diaz.web.model.User;

public class LoginAction extends ActionSupport {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private UserDAO userDAO;
    private User user;
     
    public void setUserDAO(UserDAO userDAO) {
        this.userDAO = userDAO;
    }
 
    public void setUser(User user) {
        this.user = user;
    }
     
    public User getUser() {
        return user;
    }
 
    public String execute() {
        if (userDAO.checkLogin(user)) {
            return SUCCESS;
        }
         
        return ERROR;
    }
}
