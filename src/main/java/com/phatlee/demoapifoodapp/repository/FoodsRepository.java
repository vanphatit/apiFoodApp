package com.phatlee.demoapifoodapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.phatlee.demoapifoodapp.entities.Foods;

public interface FoodsRepository extends JpaRepository<Foods, Integer> {
}
