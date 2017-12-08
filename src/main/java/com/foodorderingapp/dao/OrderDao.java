package com.foodorderingapp.dao;

import com.foodorderingapp.imp.OrderImp;
import com.foodorderingapp.model.Orders;
import com.foodorderingapp.utils.HibernateUtils;
import org.hibernate.Session;
import org.springframework.stereotype.Repository;

@Repository
public class OrderDao implements OrderImp{

    public void addOrders(Orders orders){

        Session session= HibernateUtils.getSessionfactory().openSession();
        session.getTransaction().begin();
        session.save(orders);
        session.getTransaction().commit();
        session.close();

    }
}
