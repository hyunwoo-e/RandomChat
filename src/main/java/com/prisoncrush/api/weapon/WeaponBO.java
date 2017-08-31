package com.prisoncrush.api.weapon;

import com.prisoncrush.api.model.UserWeapon;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class WeaponBO {

    @Autowired
    WeaponDAO weaponDAO;

    public int insertUserWeapon(int userId, int weaponId) {
        return weaponDAO.insertUserWeapon(userId, weaponId);
    }

    public List<UserWeapon> selectUserWeapons(int userId) {
        return weaponDAO.selectUserWeapons(userId);
    }

    public void updateUserWeapon(int userId, int weaponId, UserWeapon userWeapon) {
        weaponDAO.updateUserWeapon(userId, weaponId, userWeapon);
    }

    public void deleteUserWeapon(int userId, int weaponId) {
        weaponDAO.deleteUserWeapon(userId, weaponId);
    }
}

