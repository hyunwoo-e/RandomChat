package com.prisoncrush.api.model;

import lombok.Data;

import java.util.List;

@Data
public class Character {
    int characterId;
    String characterName;
    String story;
    String imageUrl;
    int tier;
}

