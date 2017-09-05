package com.prisoncrush.api.model;

import lombok.Data;

@Data
public class User {
    String userId;
    int coin;
    int prisonKey;
    String registDate;
    String modifyDate;
}

