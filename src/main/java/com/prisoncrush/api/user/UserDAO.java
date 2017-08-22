package com.prisoncrush.api.user;

import com.prisoncrush.api.model.User;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDAO {

    int insertUser(@Param("accountId") String accountId);

    User selectUser(@Param("accountId") String accountId);

    int updateUser(@Param("user") User user);

    int deleteUser(@Param("userId") String userId);
}

