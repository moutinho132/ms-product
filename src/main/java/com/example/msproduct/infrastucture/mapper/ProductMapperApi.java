package com.example.msproduct.infrastucture.mapper;

import com.example.msproduct.domain.model.Product;
import com.example.msproduct.infrastucture.request.ProductRequest;
import com.example.msproduct.infrastucture.response.ProductResponse;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface ProductMapperApi {

    Product requestToModel(ProductRequest request);

    List<Product> requestToModelList(List<ProductRequest> requestList);

    ProductResponse modelToResponse(Product model);

    List<ProductResponse> modelToResponseList(List<Product> products);

}
