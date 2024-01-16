package com.example.msproduct.domain.mapper;

import com.example.msproduct.domain.entity.ProductEntity;
import com.example.msproduct.domain.model.Product;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ProductMapper {
    ProductEntity modelToEntity(Product model);
    Product entityToModel(ProductEntity entity);

}
