package com.example.webservicepokeapi.domain.entity.pokemonSpecies;

import com.example.webservicepokeapi.domain.entity.common.NamedApiResource;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter
@Setter
public class PokemonSpeciesDexEntry {
    private Integer entry_number;
    private NamedApiResource pokedex;
}
