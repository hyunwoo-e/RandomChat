package com.prisoncrush.api.character;

import com.prisoncrush.api.model.Character;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class CharacterBO {

    @Autowired
    CharacterDAO characterDAO;

    public int insertUserCharacter(int userId, int characterId) {
        return characterDAO.insertUserCharacter(userId, characterId);
    }

    public List<Character> selectUserCharacters(int userId) {
        return characterDAO.selectUserCharacters(userId);
    }

    @Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
    public void updateUserCharacter(int userId, int characterId) {
        characterDAO.updateUserCharacter(userId, characterId);
    }

    @Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
    public void deleteUserCharacter(int userId, int characterId) {
        characterDAO.deleteUserCharacter(userId, characterId);
        characterDAO.deleteUserCharacterSkills(userId, characterId);
    }
}

