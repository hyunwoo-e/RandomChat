package com.prisoncrush.api.character;
import com.prisoncrush.api.model.UserCharacter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
public class CharacterController {

    @Autowired
    CharacterBO characterBO;

    @RequestMapping(value = "/user/{userId}/characters/create", method = RequestMethod.POST)
    public void insertUserCharacter(@PathVariable String userId, @RequestParam(required = true) String characterId) {
        characterBO.insertUserCharacter(userId, characterId);
        return;
    }

    @RequestMapping(value = "/user/{userId}/characters", method = RequestMethod.GET)
    public List<UserCharacter> selectUserCharacters(@PathVariable String userId) {
        return characterBO.selectUserCharacters(userId);
    }

    @RequestMapping(value = "/user/{userId}/characters/{characterId}/skill/create", method = RequestMethod.POST)
    public void insertUserCharacterSkill(@PathVariable String userId, @PathVariable String characterId, @RequestParam(required = true) String skillId) {
        characterBO.insertUserCharacterSkill(userId, characterId, skillId);
        return;
    }

    @RequestMapping(value = "/user/{userId}/characters/{characterId}/skills/{skillId}/delete", method = RequestMethod.POST)
    public void deleteUserCharacterSkill(@PathVariable String userId, @PathVariable String characterId, @PathVariable String skillId) {
        characterBO.deleteUserCharacterSkill(userId, characterId, skillId);
        return;
    }

    @RequestMapping(value = "/user/{userId}/characters/{characterId}/delete", method = RequestMethod.POST)
    public void deleteUserCharacter(@PathVariable String userId, @PathVariable String characterId) {
        characterBO.deleteUserCharacter(userId, characterId);
        return;
    }

    //TODO: GlobalExceptionHandler 적용
    @ExceptionHandler(Exception.class)
    public void globalExceptionHandler(Exception e) {
        System.out.println("[유저 캐릭터 에러]");
    }
}