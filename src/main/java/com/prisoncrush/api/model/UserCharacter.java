package com.prisoncrush.api.model;

import com.fasterxml.jackson.annotation.JsonUnwrapped;
import lombok.Data;

import java.util.List;

@Data
public class UserCharacter {
    String userId;
    String characterId;
    List<String> skills;
}

