package com.phatlee.demoapifoodapp.controllers;

import com.phatlee.demoapifoodapp.entities.Foods;
import com.phatlee.demoapifoodapp.service.iFoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/foods")
public class FoodsController {

    private final iFoodsService foodsService;

    @Autowired
    public FoodsController(iFoodsService foodsService) {
        this.foodsService = foodsService;
    }

    // GET /api/foods - Lấy danh sách các món ăn
    @GetMapping
    public ResponseEntity<List<Foods>> getAllFoods() {
        List<Foods> foodsList = foodsService.findAll();
        return ResponseEntity.ok(foodsList);
    }

    // GET /api/foods/{id} - Lấy thông tin chi tiết của một món ăn theo id
    @GetMapping("/{id}")
    public ResponseEntity<Foods> getFoodById(@PathVariable int id) {
        return foodsService.findById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }
}