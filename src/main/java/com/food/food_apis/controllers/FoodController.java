package com.food.food_apis.controllers;

import com.food.food_apis.entites.Food;
import com.food.food_apis.services.FoodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class FoodController {

    @Autowired
    private FoodService foodService;

    @PostMapping("/create")
    public Food createFood(@RequestBody Food food){
        return foodService.createFood(food);
    }
    @PutMapping("/update/{id}")
    public Food updateFood(@RequestBody Food food, @PathVariable Integer id){
        return foodService.updateFood(food,id);
    }
    @GetMapping("/single/{id}")
    public Optional<Food> getFoodById(@PathVariable Integer id){
        return foodService.getFoodById(id);
    }
    public List<Food> getAll(){
        return foodService.getAllFood();
    }
}
