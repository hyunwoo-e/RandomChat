package com.prisoncrush.api.character;

import com.prisoncrush.api.model.Character;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
public class CharacterController {

    @Autowired
    CharacterBO characterBO;

    @RequestMapping(value = "/user/{userId}/characters", method = RequestMethod.POST)
    public void insertUserCharacter(@PathVariable int userId, @RequestParam(required = true) int characterId) {
        characterBO.insertUserCharacter(userId, characterId);
        return;
    }

    @RequestMapping(value = "/user/{userId}/characters", method = RequestMethod.GET)
    public List<Character> selectUserCharacters(@PathVariable int userId) {
        return characterBO.selectUserCharacters(userId);
    }

    //TODO: 스킬 변경 및 추가 기능
    @RequestMapping(value = "/user/{userId}/characters/{characterId}", method = RequestMethod.PUT)
    public void updateUserCharacter(@PathVariable int userId, @PathVariable int characterId) {
        characterBO.updateUserCharacter(userId, characterId);
        return;
    }

    @RequestMapping(value = "/user/{userId}/characters/{characterId}", method = RequestMethod.DELETE)
    public void deleteUserCharacter(@PathVariable int userId, @PathVariable int characterId) {
        characterBO.deleteUserCharacter(userId, characterId);
        return;
    }

    //TODO: GlobalExceptionHandler 적용
    @ExceptionHandler(Exception.class)
    public void globalExceptionHandler(Exception e){

    }
}
