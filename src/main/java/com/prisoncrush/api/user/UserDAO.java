package com.prisoncrush.api.user;

import com.prisoncrush.api.model.User;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDAO {

    int insertUser(@Param("userId") String userId);

    User selectUser(@Param("userId") String userId);

    int updateUser(@Param("userId") String userId, @Param("coin") int coin, @Param("prisonKey") int prisonKey);

    int deleteUser(@Param("userId") String userId);
}

