package com.example.webservicepokeapi.domain.entity.pokemon;

import com.example.webservicepokeapi.domain.entity.common.NamedApiResource;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Data
@Getter
@Setter
public class PokemonTypePast {
    private NamedApiResource generation;
    private List<PokemonType> types;
}