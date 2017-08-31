package com.prisoncrush.api.model;

import lombok.Data;

@Data
public class UserWeapon {
    int userId;
    int weaponId;
    int damage;
    int damageLevel;
    int criticalDamage;
    int criticalDamgageLevel;
    int criticalProbability;
    int criticalProbabilityLevel;
}

