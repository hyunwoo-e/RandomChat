package com.prisoncrush.api.weapon;

import com.prisoncrush.api.model.UserWeapon;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface WeaponDAO {

    int insertUserWeapon(@Param("userId") int userId, @Param("weaponId") int weaponId);

    List<UserWeapon> selectUserWeapons(@Param("userId") int userId);

    int updateUserWeapon(@Param("userId") int userId, @Param("weaponId") int weaponId);

    int deleteUserWeapon(@Param("userId") int userId, @Param("weaponId") int weaponId, @Param("userWeapon") UserWeapon userWeapon);
}

