package com.prisoncrush.api.model;

import lombok.Data;

@Data
public class User {

    String userId;
    String accountId;
    int coin;
    int prisonKey;
    String registDate;
    String modifyDate;
}

