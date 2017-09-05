package com.prisoncrush.api.user;

import com.prisoncrush.api.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserBO {

    @Autowired
    UserDAO userDAO;

    public int insertUser(String userId) {
        return userDAO.insertUser(userId);
    }

    public User selectUser(String userId) {
        return userDAO.selectUser(userId);
    }

    public void updateUser(String userId, int coin, int prisonKey) {
        userDAO.updateUser(userId, coin, prisonKey);
    }

    public void deleteUser(String userId) {
        userDAO.deleteUser(userId);
    }

}

