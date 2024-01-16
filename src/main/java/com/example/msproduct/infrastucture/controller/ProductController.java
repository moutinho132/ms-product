package com.example.msproduct.infrastucture.controller;

import com.example.msproduct.aplication.ProductManagementService;
import com.example.msproduct.infrastucture.apis.ProductApi;
import com.example.msproduct.infrastucture.mapper.ProductMapperApi;
import com.example.msproduct.infrastucture.request.ProductRequest;
import com.example.msproduct.infrastucture.response.ProductResponse;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@AllArgsConstructor
@RestController
@RequestMapping(value = ("/api/product"))
public class ProductController implements ProductApi {
    private final ProductManagementService service;
    private final ProductMapperApi mapperApi;

    @Override
    public ProductResponse save(ProductRequest request) {
        return mapperApi.modelToResponse(service.saveProduct(mapperApi.requestToModel(request)));
    }
}
