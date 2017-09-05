package com.prisoncrush.api.weapon;

import com.prisoncrush.api.model.UserWeapon;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class WeaponBO {

    @Autowired
    WeaponDAO weaponDAO;

    public int insertUserWeapon(String userId, String weaponId) {
        return weaponDAO.insertUserWeapon(userId, weaponId);
    }

    public List<UserWeapon> selectUserWeapons(String userId) {
        return weaponDAO.selectUserWeapons(userId);
    }

    public void updateUserWeapon(String userId, String weaponId, UserWeapon userWeapon) {
        weaponDAO.updateUserWeapon(userId, weaponId, userWeapon);
    }

    public void deleteUserWeapon(String userId, String weaponId) {
        weaponDAO.deleteUserWeapon(userId, weaponId);
    }
}

