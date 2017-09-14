package com.prisoncrush.api.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

@Data
public class User {
    String userId;
    int coin;
    int prisonKey;
    int maxScore;
    String weaponId;
    String characterId;
}

