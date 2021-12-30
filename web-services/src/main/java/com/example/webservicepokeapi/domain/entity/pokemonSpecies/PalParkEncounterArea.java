package com.example.webservicepokeapi.domain.entity.pokemonSpecies;

import com.example.webservicepokeapi.domain.entity.common.NamedApiResource;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter
@Setter
public class PalParkEncounterArea {
    private Integer base_score;
    private Integer rate;
    private NamedApiResource area;
}
