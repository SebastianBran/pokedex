package com.example.webservicepokeapi.service;

import com.example.webservicepokeapi.domain.entity.pagination.NamedApiResourceList;
import com.example.webservicepokeapi.domain.entity.pokemon.Pokemon;
import com.example.webservicepokeapi.domain.entity.pokemonSpecies.PokemonSpecies;
import com.example.webservicepokeapi.domain.service.PokemonService;
import com.example.webservicepokeapi.exception.ResourceValidationException;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class PokemonServiceImpl implements PokemonService {
    private final String BASE_URL = "https://pokeapi.co/api/v2/";
    private final RestTemplate restTemplate;

    public PokemonServiceImpl(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @Override
    public NamedApiResourceList getPokemons(Integer offset, Integer limit) {
        String endpoint = "pokemon?";

        if (offset < 0 || limit < 0)
            throw new ResourceValidationException("Offset and limit cannot be negative numbers.");

        String pagination = "offset=%d&limit=%d".formatted(offset, limit);

        return restTemplate.getForObject(BASE_URL + endpoint + pagination, NamedApiResourceList.class);
    }

    @Override
    public Pokemon getPokemonByName(String name) {
        String endpoint = "pokemon/";

        if (name.isBlank())
            throw new ResourceValidationException("The name of the pokemon cannot be an empty string.");

        return restTemplate.getForObject(BASE_URL + endpoint + name, Pokemon.class);
    }

    @Override
    public PokemonSpecies getPokemonSpeciesById(Integer id) {
        String endpoint = "pokemon-species/";

        if (id == null)
            throw new ResourceValidationException("The id of the pokemon species cannot be null");

        return restTemplate.getForObject(BASE_URL + endpoint + id, PokemonSpecies.class);
    }
}
