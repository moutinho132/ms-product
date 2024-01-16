package com.example.msproduct.aplication;

import com.example.msproduct.domain.model.Product;
import com.example.msproduct.domain.service.ProductService;
import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.Objects;

@AllArgsConstructor
@Service
@Slf4j
public class ProductManagementService {
    private final ProductService service;

    @Transactional
    public Product saveProduct(final Product model) {
        return buildSaveProduct(model);
    }

    private Product buildSaveProduct(Product model) {
        return Objects.nonNull(model.getId()) ?
                service.findById(model.getId())
                        .withCodProduct(model.getCodProduct())
                        .withNameProduct(model.getNameProduct())
                        .withStatus(model.getStatus())
                        .withProductDescription(model.getProductDescription())
                : service.saveProduct(model);
    }
}
