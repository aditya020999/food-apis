package com.food.food_apis.repositories;

import com.food.food_apis.entites.Food;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FoodRepo extends JpaRepository<Food,Integer> {

}
