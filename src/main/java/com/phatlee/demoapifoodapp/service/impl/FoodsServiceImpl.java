package com.phatlee.demoapifoodapp.service.impl;

import com.phatlee.demoapifoodapp.entities.Foods;
import com.phatlee.demoapifoodapp.repository.FoodsRepository;
import com.phatlee.demoapifoodapp.service.iFoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FoodsServiceImpl implements iFoodsService {

    private final FoodsRepository foodsRepository;

    @Autowired
    public FoodsServiceImpl(FoodsRepository foodsRepository) {
        this.foodsRepository = foodsRepository;
    }

    @Override
    public List<Foods> findAll() {
        return foodsRepository.findAll();
    }

    @Override
    public Optional<Foods> findById(int id) {
        return foodsRepository.findById(id);
    }

    @Override
    public Foods save(Foods food) {
        return foodsRepository.save(food);
    }

    @Override
    public void deleteById(int id) {
        foodsRepository.deleteById(id);
    }
}