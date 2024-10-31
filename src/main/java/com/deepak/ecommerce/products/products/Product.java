package com.deepak.ecommerce.products.products;


import jakarta.persistence.Entity;
import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.FieldType;
import org.springframework.data.mongodb.core.mapping.MongoId;

import java.util.List;

@Data
@Entity
@Document(collection = "products")
public class Product {

    @MongoId(FieldType.OBJECT_ID)
    private String productId;

    private String productName;

    private String productDescription;

    private Long price;

    private String productImage;

}
