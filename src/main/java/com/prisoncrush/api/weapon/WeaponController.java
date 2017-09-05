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

    @RequestMapping(value = "/user/{userId}/weapons/create", method = RequestMethod.POST)
    public void insertUserWeapon(@PathVariable String userId, @RequestParam(required = true) String weaponId) {
        weaponBO.insertUserWeapon(userId, weaponId);
        return;
    }

    @RequestMapping(value = "/user/{userId}/weapons", method = RequestMethod.GET)
    public List<UserWeapon> selectUserWeapons(@PathVariable String userId) {
        return weaponBO.selectUserWeapons(userId);
    }

    @RequestMapping(value = "/user/{userId}/weapons/{weaponId}/update", method = RequestMethod.POST)
    public void updateUserWeapon(@PathVariable String userId, @PathVariable String weaponId, @Valid UserWeapon userWeapon, BindingResult bindingResult) throws Exception {
        if(bindingResult.hasErrors()) {
            throw new Exception();
        }

        weaponBO.updateUserWeapon(userId, weaponId, userWeapon);
        return;
    }

    @RequestMapping(value = "/user/{userId}/weapons/{weaponId}/delete", method = RequestMethod.POST)
    public void deleteUserWeapon(@PathVariable String userId, @PathVariable String weaponId) {
        weaponBO.deleteUserWeapon(userId, weaponId);
        return;
    }

    //TODO: GlobalExceptionHandler 적용
    @ExceptionHandler(Exception.class)
    public void globalExceptionHandler(Exception e){

    }
}

