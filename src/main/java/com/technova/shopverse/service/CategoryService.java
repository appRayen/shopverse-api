package com.technova.shopverse.service;

import com.technova.shopverse.dto.CategoryDTO;
import com.technova.shopverse.model.Category;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


public interface CategoryService {


    List<Category> getAllCategories();

    Optional<Category> getCategoryById(Long id);

    Category createCategory(Category category);

    Category updateCategory(Long id, Category category);

    void deleteCategory(Long id);

}
