package com.phatlee.demoapifoodapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.phatlee.demoapifoodapp.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Integer> {
}