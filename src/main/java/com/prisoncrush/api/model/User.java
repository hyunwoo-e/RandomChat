package com.prisoncrush.api.model;

import lombok.Data;

@Data
public class User {

    String userId;
    String accountId;
    Integer coin;
    Integer prison_key;
    String registDate;
    String modifyDate;
}

