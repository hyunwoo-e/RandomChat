package com.prisoncrush.api.rank;

import com.prisoncrush.api.model.Rank;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RankDAO {
    int insertUserRank(@Param("userId") String userId, @Param("score") int score);

    List<Rank> selectRanks(@Param("offset") int offset, @Param("limit") int limit);

    int updateUserScore(@Param("userId") String userId, @Param("score") int score);
}

