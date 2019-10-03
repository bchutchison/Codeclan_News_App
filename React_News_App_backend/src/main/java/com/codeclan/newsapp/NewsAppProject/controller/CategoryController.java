package com.codeclan.newsapp.NewsAppProject.controller;

import com.codeclan.newsapp.NewsAppProject.models.Category;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import com.codeclan.newsapp.NewsAppProject.models.Journalist;
import com.codeclan.newsapp.NewsAppProject.repository.CategoryRepository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/categories")
public class CategoryController {

    @Autowired
    CategoryRepository categoryRepository;

// Aggregate root

    @GetMapping("/categories")
    List<Category> all() {
        return categoryRepository.findAll();
    }

    @PostMapping("/categories")
    Category newCategory(@RequestBody Category newCategory) {
        return categoryRepository.save(newCategory);
    }

//Delete
    @DeleteMapping("/categories/{id}")
    void deleteCategory(@PathVariable Long id) {
        categoryRepository.deleteById(id);
    }
}
