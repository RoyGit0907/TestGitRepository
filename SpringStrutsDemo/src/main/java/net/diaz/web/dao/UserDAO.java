package net.diaz.web.dao;

import net.diaz.web.model.User;

public class UserDAO {
    public boolean checkLogin(User user) {
        return user.getUsername().equals("admin")
                && user.getPassword().equals("123");
    }
}
