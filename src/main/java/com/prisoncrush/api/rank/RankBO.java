package com.prisoncrush.api.rank;

import com.prisoncrush.api.model.Rank;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RankBO {

    @Autowired
    RankDAO rankDAO;

    public int insertUserRank(String userId, int score) {
        return rankDAO.insertUserRank(userId, score);
    }

    public List<Rank> selectRanks(int offset, int limit) {
        return rankDAO.selectRanks(offset, limit);
    }

    public int updateUserScore(String userId, int score) {
        return rankDAO.updateUserScore(userId, score);
    }
}

