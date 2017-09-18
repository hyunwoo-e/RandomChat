package com.randomchat.web.chat;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class ChatController {

    @RequestMapping(value = "/chat", method = RequestMethod.GET)
    public String chat() {
        return "chat/chat";
    }

    //TODO: GlobalExceptionHandler 적용
    @ExceptionHandler(Exception.class)
    public void globalExceptionHandler(Exception e){

    }
}

