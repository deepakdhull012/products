package com.deepak.ecommerce.products.products;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    public Product save(Product product) {
        return productRepository.save(product);
    }

    public Product update(String productId, Product product) {
        product.setProductId(productId);
        return productRepository.save(product);
    }

    public void delete(String productId) {
        productRepository.deleteById(productId);
    }
}
