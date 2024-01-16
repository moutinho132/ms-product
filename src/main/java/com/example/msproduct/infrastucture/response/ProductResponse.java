package com.example.msproduct.infrastucture.response;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

import java.io.Serial;
import java.io.Serializable;

@AllArgsConstructor
@Getter
@Builder
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class ProductResponse implements Serializable {
    @Serial
    private static final long serialVersionUID = 740827790307783028L;
    private final Integer id;
    private final String codProduct;
    private final String nameProduct;
    private final String productDescription;
    private final Boolean status;
}
