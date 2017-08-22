package com.prisoncrush.api.user;

import com.prisoncrush.api.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import sun.rmi.runtime.Log;

import javax.validation.Valid;

@Controller
public class UserController {

    @Autowired
    UserBO userBO;

    @RequestMapping(value = "/user", method = RequestMethod.POST)
    @ResponseBody
    public ResponseEntity<String> create(@RequestParam(required = true) String accountId) {
        userBO.insertUser(accountId);
        return new ResponseEntity("", HttpStatus.OK);
    }

    @RequestMapping(value = "/user", method = RequestMethod.GET)
    @ResponseBody
    public ResponseEntity<User> select(@RequestParam(required = true) String accountId) {
        User user = userBO.selectUser(accountId);
        return new ResponseEntity(user, HttpStatus.OK);
    }

    @RequestMapping(value = "/user", method = RequestMethod.PUT)
    @ResponseBody
    public ResponseEntity<String> update(@RequestParam(required = true) @Valid User user, BindingResult bindingResult) throws Exception {
        if(bindingResult.hasErrors()) {
            throw new Exception();
        }
        userBO.updateUser(user);
        return new ResponseEntity("", HttpStatus.OK);
    }

    @RequestMapping(value = "/user", method = RequestMethod.DELETE)
    @ResponseBody
    public ResponseEntity<String> delete(@RequestParam(required = true) String userId) {
        userBO.deleteUser(userId);
        return new ResponseEntity("", HttpStatus.OK);
    }

    //TODO: GlobalExceptionHandler 적용
    @ExceptionHandler(Exception.class)
    public void globalExceptionHandler(Exception e){

    }
}

