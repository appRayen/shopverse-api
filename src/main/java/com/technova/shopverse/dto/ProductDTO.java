package com.technova.shopverse.dto;

import com.technova.shopverse.model.Product;

public class ProductDTO {
    private Long id;
    private String name;
    private String description;
    private Double price;
    private String categoryName; // solo el nombre, no el objeto entero

    public ProductDTO() {
    }

    public ProductDTO(Long id, String categoryName, Double price, String description, String name) {
        this.id = id;
        this.categoryName = categoryName;
        this.price = price;
        this.description = description;
        this.name = name;
    }

    public ProductDTO(Long id, String name, Double price, String categoryName) {
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }
}