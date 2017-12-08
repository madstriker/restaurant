package com.foodorderingapp.controller;

import com.foodorderingapp.dto.OrderDto;
import com.foodorderingapp.model.Food;
import com.foodorderingapp.service.FoodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FoodController {
    @Autowired
    FoodService foodService;

    @RequestMapping(value="/addFood" , method = RequestMethod.POST)
    public void addOrders(@RequestBody OrderDto orderDto){

        Food food=new Food();
        food.setFoodPrice(orderDto.getFoodPrice());
        food.setFoodName(orderDto.getFoodName());
        foodService.addFood(food);

    }

}
