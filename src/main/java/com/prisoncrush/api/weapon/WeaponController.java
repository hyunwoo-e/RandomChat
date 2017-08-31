package com.prisoncrush.api.weapon;

import com.prisoncrush.api.model.UserWeapon;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
public class WeaponController {

    @Autowired
    WeaponBO weaponBO;

    @RequestMapping(value = "/user/{userId}/weapons", method = RequestMethod.POST)
    public void insertUserWeapon(@PathVariable int userId, @RequestParam(required = true) int weaponId) {
        weaponBO.insertUserWeapon(userId, weaponId);
        return;
    }

    @RequestMapping(value = "/user/{userId}/weapons", method = RequestMethod.GET)
    public List<UserWeapon> selectUserWeapons(@PathVariable int userId) {
        return weaponBO.selectUserWeapons(userId);
    }

    @RequestMapping(value = "/user/{userId}/weapons/{weaponId}", method = RequestMethod.PUT)
    public void updateUserWeapon(@PathVariable int userId, @PathVariable int weaponId, @Valid UserWeapon userWeapon, BindingResult bindingResult) throws Exception {
        if(bindingResult.hasErrors()) {
            throw new Exception();
        }

        weaponBO.updateUserWeapon(userId, weaponId, userWeapon);
        return;
    }

    @RequestMapping(value = "/user/{userId}/weapons/{weaponId}", method = RequestMethod.DELETE)
    public void deleteUserWeapon(@PathVariable int userId, @PathVariable int weaponId) {
        weaponBO.deleteUserWeapon(userId, weaponId);
        return;
    }

    //TODO: GlobalExceptionHandler 적용
    @ExceptionHandler(Exception.class)
    public void globalExceptionHandler(Exception e){

    }
}

