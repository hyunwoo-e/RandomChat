package com.prisoncrush.api.character;
import com.prisoncrush.api.model.UserCharacter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class CharacterBO {

    @Autowired
    CharacterDAO characterDAO;

    public int insertUserCharacter(String userId, String characterId) {
        return characterDAO.insertUserCharacter(userId, characterId);
    }

    public List<UserCharacter> selectUserCharacters(String userId) {
        return characterDAO.selectUserCharacters(userId);
    }

    public void insertUserCharacterSkill(String userId, String characterId, String skillId) {
        characterDAO.insertUserCharacterSkill(userId, characterId, skillId);
    }

    public void deleteUserCharacterSkill(String userId, String characterId, String skillId) {
        characterDAO.deleteUserCharacterSkill(userId, characterId, skillId);
    }

    @Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
    public void deleteUserCharacter(String userId, String characterId) {
        characterDAO.deleteUserCharacter(userId, characterId);
        characterDAO.deleteUserCharacterSkills(userId, characterId);
    }
}

