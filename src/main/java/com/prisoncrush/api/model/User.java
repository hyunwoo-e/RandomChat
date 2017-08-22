package com.prisoncrush.api.model;

import lombok.Data;

@Data
public class User {

    String userId;
    String accountId;
    Integer coin;
    Integer prisonKey;
    String registDate;
    String modifyDate;
}

