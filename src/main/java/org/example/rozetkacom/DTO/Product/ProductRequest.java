package org.example.rozetkacom.DTO.Product;

import lombok.Data;
import org.example.rozetkacom.Entity.Category;

@Data
public class ProductRequest {
    private String productName;
    private double price;
    private Long stockQuantity;
    private Category category;
}
