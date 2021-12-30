package com.example.webservicepokeapi.domain.entity.pokemon;

import com.example.webservicepokeapi.domain.entity.common.NamedApiResource;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter
@Setter
public class PokemonAbility {
    private boolean is_hidden;
    private Integer slot;
    private NamedApiResource ability;
}
