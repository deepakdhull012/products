package com.deepak.ecommerce.products.products;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("products")
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping("")
    public List<Product> getAllProducts() {
        return productService.getAllProducts();
    }

    @PostMapping("")
    public Product addProduct(@RequestBody Product product) {
        return productService.save(product);
    }

    @PatchMapping("/{productId}")
    public Product updateProduct(@PathVariable("productId") String productId, @RequestBody Product product) {
        return productService.update(productId, product);
    }

    @DeleteMapping("/{productId}")
    public void deleteProduct(@PathVariable("productId") String productId) {
        productService.delete(productId);
    }
}
