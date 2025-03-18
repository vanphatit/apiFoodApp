package com.phatlee.demoapifoodapp.controllers;

import com.phatlee.demoapifoodapp.entities.Category;
import com.phatlee.demoapifoodapp.service.iCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/categories")
public class CategoryController {

    private final iCategoryService categoryService;

    @Autowired
    public CategoryController(iCategoryService categoryService) {
        this.categoryService = categoryService;
    }

    // GET /api/categories - Lấy danh sách các danh mục
    @GetMapping
    public ResponseEntity<List<Category>> getAllCategories() {
        List<Category> categories = categoryService.findAll();
        return ResponseEntity.ok(categories);
    }

    // GET /api/categories/{id} - Lấy thông tin chi tiết của một danh mục theo id
    @GetMapping("/{id}")
    public ResponseEntity<Category> getCategoryById(@PathVariable int id) {
        return categoryService.findById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }
}
