package com.food.food_apis.services;

import com.food.food_apis.entites.Food;
import com.food.food_apis.repositories.FoodRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FoodService {

    @Autowired
    private FoodRepo foodRepo;

    public Food createFood(Food food){
        return foodRepo.save(food);
    }
    public Food updateFood(Food food,Integer id){
        Food f=foodRepo.findById(id).orElseThrow(()->new RuntimeException("no food find with id:"+id));
        f.setName(food.getName());
        f.setColor(food.getColor());
        f.setPrice(food.getPrice());
        return foodRepo.save(f);
    }
    public Optional<Food> getFoodById(Integer id){
        return foodRepo.findById(id);
    }
    public List<Food> getAllFood(){
        return foodRepo.findAll();
    }
}
