package com.example.webservicepokeapi.domain.entity.pokemon;

import com.example.webservicepokeapi.domain.entity.common.NamedApiResource;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Data
@Getter
@Setter
public class Pokemon {
    private Integer id;
    private String name;
    private Integer base_experience;
    private Integer height;
    private boolean is_default;
    private Integer order;
    private Integer weight;
    private List<PokemonAbility> abilities;
    private List<NamedApiResource> forms;
    private List<PokemonGameIndex> game_indices;
    private List<PokemonHeldItem> held_items;
    private String location_area_encounters;
    private List<PokemonMove> moves;
    private List<PokemonTypePast> past_types;
    private PokemonSprites sprites;
    private NamedApiResource species;
    private List<PokemonStat> stats;
    private List<PokemonType> types;
}