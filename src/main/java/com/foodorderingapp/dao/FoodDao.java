package com.foodorderingapp.dao;

import com.foodorderingapp.model.Food;
import com.foodorderingapp.utils.HibernateUtils;
import org.hibernate.Session;
import org.springframework.stereotype.Repository;

@Repository
public class FoodDao {

    public void addFood(Food food) {

        Session session = HibernateUtils.getSessionfactory().openSession();
        session.getTransaction().begin();
        session.save(food);
        session.getTransaction().commit();
        session.close();
    }

}
