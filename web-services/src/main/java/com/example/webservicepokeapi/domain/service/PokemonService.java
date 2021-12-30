package com.example.webservicepokeapi.domain.service;

import com.example.webservicepokeapi.domain.entity.pagination.NamedApiResourceList;
import com.example.webservicepokeapi.domain.entity.pokemon.Pokemon;
import com.example.webservicepokeapi.domain.entity.pokemonSpecies.PokemonSpecies;

public interface PokemonService {
    NamedApiResourceList getPokemons(Integer offset, Integer limit);
    Pokemon getPokemonByName(String name);
    PokemonSpecies getPokemonSpeciesById(Integer id);
}
