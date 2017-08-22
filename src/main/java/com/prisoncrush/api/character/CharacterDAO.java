package com.prisoncrush.api.character;
import com.prisoncrush.api.model.UserCharacter;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CharacterDAO {

    int insertUserCharacter(@Param("userId") int userId, @Param("characterId") int characterId);

    List<UserCharacter> selectUserCharacters(@Param("userId") int userId);

    int updateUserCharacter(@Param("userId") int userId, @Param("characterId") int characterId);

    int deleteUserCharacter(@Param("userId") int userId, @Param("characterId") int characterId);

    int deleteUserCharacterSkills(@Param("userId") int userId, @Param("characterId") int characterId);
}

