package com.prisoncrush.api.character;
import com.prisoncrush.api.model.UserCharacter;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CharacterDAO {

    int insertUserCharacter(@Param("userId") String userId, @Param("characterId") String characterId);

    List<UserCharacter> selectUserCharacters(@Param("userId") String userId);

    int deleteUserCharacter(@Param("userId") String userId, @Param("characterId") String characterId);

    int deleteUserCharacterSkills(@Param("userId") String userId, @Param("characterId") String characterId);

    int insertUserCharacterSkill(@Param("userId") String userId, @Param("characterId") String characterId, @Param("skillId") String skillId);

    int deleteUserCharacterSkill(@Param("userId") String userId, @Param("characterId") String characterId, @Param("skillId") String skillId);
}

