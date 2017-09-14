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

    public int updateUser(String userId, int coin, int prisonKey, String weaponId, String characterId) {
        return userDAO.updateUser(userId, coin, prisonKey, weaponId, characterId);
    }

    public int deleteUser(String userId) {
        return userDAO.deleteUser(userId);
    }

}

