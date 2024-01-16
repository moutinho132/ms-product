package com.example.msproduct.infrastucture.request;

import lombok.Getter;
import lombok.NoArgsConstructor;

import java.io.Serial;
import java.io.Serializable;

@NoArgsConstructor
@Getter
public class ProductRequest implements Serializable {
    @Serial
    private static final long serialVersionUID = 740827790307783027L;
    private Integer id;
    private String codProduct;
    private String nameProduct;
    private String productDescription;
    private Boolean status;
}
