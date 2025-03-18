package com.phatlee.demoapifoodapp.service;

import com.phatlee.demoapifoodapp.entities.Category;
import java.util.List;
import java.util.Optional;

public interface iCategoryService {
    List<Category> findAll();
    Optional<Category> findById(int id);
    Category save(Category category);
    void deleteById(int id);
}
