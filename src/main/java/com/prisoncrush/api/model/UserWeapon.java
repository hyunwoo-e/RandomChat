package com.prisoncrush.api.model;

import lombok.Data;

@Data
public class UserWeapon {
    String userId;
    String weaponId;
    int damageLevel;
    int criticalLevel;
    int probabilityLevel;
}

