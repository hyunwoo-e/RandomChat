package com.prisoncrush.api.model;

import lombok.Data;

@Data
public class UserWeapon {
    int userId;
    int weaponId;
    int damageLevel;
    int criticalLevel;
    int probabilityLevel;
}

