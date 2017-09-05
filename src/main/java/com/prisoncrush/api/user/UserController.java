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

@RestController
public class UserController {

    @Autowired
    UserBO userBO;

    @RequestMapping(value = "/user/create", method = RequestMethod.POST)
    public void create(@RequestParam(required = true) String userId) {
        userBO.insertUser(userId);
        return;
    }

    @RequestMapping(value = "/user/{userId}", method = RequestMethod.GET)
    public User select(@PathVariable(required = true) String userId) {
        return userBO.selectUser(userId);
    }

    @RequestMapping(value = "/user/{userId}/update", method = RequestMethod.POST)
    public void update(@PathVariable(required = true) String userId, @RequestParam int coin, @RequestParam int prisonKey) {
        userBO.updateUser(userId, coin, prisonKey);
        return;
    }

    @RequestMapping(value = "/user/{userId}/delete", method = RequestMethod.POST)
    public void delete(@PathVariable(required = true) String userId) {
        userBO.deleteUser(userId);
        return;
    }

    //TODO: GlobalExceptionHandler 적용
    @ExceptionHandler(Exception.class)
    public void globalExceptionHandler(Exception e){
        System.out.println("[유저 에러]");
        return;
    }
}

