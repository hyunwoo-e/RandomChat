package com.prisoncrush.api.user;

import com.prisoncrush.api.model.User;
import lombok.extern.log4j.Log4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@Controller
public class UserController {

    @Autowired
    UserBO userBO;

    @RequestMapping(value = "/user/create", method = RequestMethod.POST)
    @ResponseBody
    public ResponseEntity create(@RequestParam(required = true) String userId) {
        userBO.insertUser(userId);
        return new ResponseEntity(HttpStatus.OK);
    }

    @RequestMapping(value = "/user/{userId}", method = RequestMethod.GET)
    @ResponseBody
    public ResponseEntity<User> select(@PathVariable(required = true) String userId) {
        User user = userBO.selectUser(userId);
        if(user == null)
            return new ResponseEntity<User>(HttpStatus.NOT_FOUND);

        return new ResponseEntity<User>(user, HttpStatus.OK);
    }

    @RequestMapping(value = "/user/{userId}/update", method = RequestMethod.POST)
    @ResponseBody
    public ResponseEntity update(@PathVariable(required = true) String userId, @RequestParam int coin, @RequestParam int prisonKey, @RequestParam String weaponId, @RequestParam String characterId) {
        userBO.updateUser(userId, coin, prisonKey, weaponId, characterId);
        return new ResponseEntity(HttpStatus.OK);
    }

    @RequestMapping(value = "/user/{userId}/delete", method = RequestMethod.POST)
    public ResponseEntity delete(@PathVariable(required = true) String userId) {
        userBO.deleteUser(userId);
        return new ResponseEntity(HttpStatus.OK);
    }

    //TODO: GlobalExceptionHandler 적용
    @ExceptionHandler(Exception.class)
    public void globalExceptionHandler(Exception e){
        System.out.println("[유저 에러]");
        return;
    }
}

