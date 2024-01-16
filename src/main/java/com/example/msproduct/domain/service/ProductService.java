package com.example.msproduct.domain.service;

import com.example.msproduct.domain.mapper.ProductMapper;
import com.example.msproduct.domain.model.Product;
import com.example.msproduct.domain.repository.ProductRepository;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.Objects;

@Service
@Slf4j
@AllArgsConstructor
public class ProductService {
    private final ProductMapper mapper;
    private final ProductRepository repository;

    public Product saveProduct(Product model){
        Product product = null;
        if(Objects.nonNull(model)){
            product = mapper.entityToModel(repository.save(mapper.modelToEntity(model)));
        }
        return product;
    }

    public Product findById(final Integer id){
        return mapper.entityToModel(repository.findById(id).orElse(null));
    }
}
