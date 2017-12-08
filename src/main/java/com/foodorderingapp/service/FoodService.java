package com.foodorderingapp.service;

import com.foodorderingapp.dao.FoodDao;
import com.foodorderingapp.model.Food;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FoodService {
    @Autowired
    FoodDao foodDao;

    public void addFood(Food food) {

        foodDao.addFood(food);
    }


}
