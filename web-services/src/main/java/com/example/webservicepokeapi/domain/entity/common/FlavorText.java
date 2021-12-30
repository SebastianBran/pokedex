package com.example.webservicepokeapi.domain.entity.common;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter
@Setter
public class FlavorText {
    private String flavor_text;
    private NamedApiResource language;
    private NamedApiResource version;
}
