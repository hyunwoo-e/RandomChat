package com.prisoncrush.api.rank;

import com.prisoncrush.api.model.Rank;
import com.prisoncrush.api.user.UserBO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;


@RestController
public class RankController {

    @Autowired
    RankBO rankBO;

    @RequestMapping(value = "/rank/create", method = RequestMethod.POST)
    public void insertUserRank(@RequestParam String userId, @RequestParam int score) {
        rankBO.insertUserRank(userId, score);
        rankBO.updateUserScore(userId, score);
        return;
    }

    @RequestMapping(value = "/rank", method = RequestMethod.GET)
    public List<Rank> selectRanks(@RequestParam int offset, @RequestParam int limit) {
        return rankBO.selectRanks(offset, limit);
    }

    //TODO: GlobalExceptionHandler 적용
    @ExceptionHandler(Exception.class)
    public void globalExceptionHandler(Exception e){
        System.out.println("[유저 순위 에러]");
    }
}

