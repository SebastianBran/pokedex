package com.example.webservicepokeapi.api;

import com.example.webservicepokeapi.domain.entity.pagination.NamedApiResourceList;
import com.example.webservicepokeapi.domain.entity.pokemon.Pokemon;
import com.example.webservicepokeapi.domain.entity.pokemonSpecies.PokemonSpecies;
import com.example.webservicepokeapi.domain.service.PokemonService;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PokemonController {
    private final PokemonService pokemonService;

    @Autowired
    public PokemonController(PokemonService pokemonService) {
        this.pokemonService = pokemonService;
    }

    @Operation(summary = "Get Pokemons", description = "Get Pokemons", tags = {"Pokemon"})
    @GetMapping("pokemon")
    public NamedApiResourceList getPokemons(@RequestParam Integer offset,
                                            @RequestParam Integer limit) {
        return pokemonService.getPokemons(offset, limit);
    }

    @GetMapping("pokemon/{name}")
    public Pokemon getPokemonByName(@PathVariable String name) {
        return pokemonService.getPokemonByName(name);
    }

    @GetMapping("pokemon-species/{id}")
    public PokemonSpecies getPokemonSpeciesById(@PathVariable Integer id) {
        return pokemonService.getPokemonSpeciesById(id);
    }
}
