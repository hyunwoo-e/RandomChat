package com.prisoncrush.api.user;

import com.prisoncrush.api.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserBO {

    @Autowired
    UserDAO userDAO;

    public int insertUser(String accountId) {
        return userDAO.insertUser(accountId);
    }

    public User selectUser(String accountId) {
        return userDAO.selectUser(accountId);
    }
    public void updateUser(User user) {
        userDAO.updateUser(user);
    }

    public void deleteUser(String userId) {
        userDAO.deleteUser(userId);
    }

}

