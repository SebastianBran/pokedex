package com.example.webservicepokeapi.domain.entity.pokemonSpecies;

import com.example.webservicepokeapi.domain.entity.common.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Data
@Getter
@Setter
public class PokemonSpecies {
    private Integer id;
    private String name;
    private Integer order;
    private Integer gender_rate;
    private Integer capture_rate;
    private Integer base_happiness;
    private boolean is_baby;
    private boolean is_legendary;
    private boolean is_mythical;
    private Integer hatch_counter;
    private boolean has_gender_differences;
    private boolean forms_switchable;
    private NamedApiResource growth_rate;
    private List<PokemonSpeciesDexEntry> pokedex_numbers;
    private List<NamedApiResource> egg_groups;
    private NamedApiResource color;
    private NamedApiResource shape;
    private NamedApiResource evolves_from_species;
    private ApiResource evolution_chain;
    private NamedApiResource habitat;
    private NamedApiResource generation;
    private List<Name> names;
    private List<PalParkEncounterArea> pal_park_encounters;
    private List<FlavorText> flavor_text_entries;
    private List<Description> form_description;
    private List<Genus> genera;
    private List<PokemonSpeciesVariety> varieties;
}
