package com.example.webservicepokeapi.domain.entity.pagination;

import com.example.webservicepokeapi.domain.entity.common.NamedApiResource;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Data
@Getter
@Setter
public class NamedApiResourceList {
    private Integer count;
    private String next;
    private String previous;
    private List<NamedApiResource> results;
}
