package com.example.webservicepokeapi.domain.entity.pokemon;

import com.example.webservicepokeapi.domain.entity.common.NamedApiResource;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter
@Setter
public class PokemonMoveVersion {
    private NamedApiResource move_learn_method;
    private NamedApiResource version_group;
    private Integer level_learned_at;
}
