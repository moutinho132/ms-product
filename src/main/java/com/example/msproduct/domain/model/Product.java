package com.example.msproduct.domain.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.With;

@AllArgsConstructor
@Getter
@Builder
public class Product {
    private final Integer id;
    @With
    private final String codProduct;
    @With
    private final String nameProduct;
    @With
    private final String productDescription;
    @With
    private final Boolean status;
}
