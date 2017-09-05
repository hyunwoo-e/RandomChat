package com.prisoncrush.api.rank;

import com.prisoncrush.api.model.Rank;
import com.prisoncrush.api.model.UserWeapon;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;


@RestController
public class RankController {

    @Autowired
    RankBO rankBO;

    @RequestMapping(value = "/rank/create", method = RequestMethod.POST)
    public void insertUserScore(@RequestParam(required = true) String userId, @RequestParam(required = true) int score) {
        rankBO.insertUserScore(userId, score);
        return;
    }

    @RequestMapping(value = "/rank", method = RequestMethod.GET)
    public List<Rank> selectRanks(@RequestParam(required = true) int offset, @RequestParam(required = true) int limit) {
        return rankBO.selectRanks(offset, limit);
    }

    //TODO: GlobalExceptionHandler 적용
    @ExceptionHandler(Exception.class)
    public void globalExceptionHandler(Exception e){
        System.out.println("[유저 순위 에러]");
    }
}

