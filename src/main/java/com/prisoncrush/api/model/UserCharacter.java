package com.prisoncrush.api.model;

import com.fasterxml.jackson.annotation.JsonUnwrapped;
import lombok.Data;

import java.util.List;

@Data
public class UserCharacter {
    int userId;
    int characterId;
    String characterName;
    String story;
    String imageUrl;
    int tier;
    List<Skill> skills;
}

