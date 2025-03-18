package com.phatlee.demoapifoodapp.service;

import com.phatlee.demoapifoodapp.entities.Foods;
import java.util.List;
import java.util.Optional;

public interface iFoodsService {
    List<Foods> findAll();
    Optional<Foods> findById(int id);
    Foods save(Foods food);
    void deleteById(int id);
}
