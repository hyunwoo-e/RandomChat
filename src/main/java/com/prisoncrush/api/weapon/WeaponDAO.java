package com.prisoncrush.api.weapon;

import com.prisoncrush.api.model.UserWeapon;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface WeaponDAO {

    int insertUserWeapon(@Param("userId") String userId, @Param("weaponId") String weaponId);

    List<UserWeapon> selectUserWeapons(@Param("userId") String userId);

    int updateUserWeapon(@Param("userId") String userId, @Param("weaponId") String weaponId, @Param("userWeapon") UserWeapon userWeapon);

    int deleteUserWeapon(@Param("userId") String userId, @Param("weaponId") String weaponId);
}

