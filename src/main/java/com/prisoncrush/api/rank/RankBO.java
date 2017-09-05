package com.prisoncrush.api.rank;

import com.prisoncrush.api.model.Rank;
import com.prisoncrush.api.model.UserWeapon;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RankBO {

    @Autowired
    RankDAO rankDAO;

    public int insertUserScore(String userId, int score) {
        return rankDAO.insertUserScore(userId, score);
    }

    public List<Rank> selectRanks(int offset, int limit) {
        return rankDAO.selectRanks(offset, limit);
    }
}

