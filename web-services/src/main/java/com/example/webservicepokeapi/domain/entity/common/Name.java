package com.example.webservicepokeapi.domain.entity.common;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter
@Setter
public class Name {
    private String name;
    private NamedApiResource language;
}
