package com.foodorderingapp.dao;

import com.foodorderingapp.imp.OrderDetailImp;
import com.foodorderingapp.model.OrderDetail;
import com.foodorderingapp.utils.HibernateUtils;
import org.hibernate.Session;
import org.springframework.stereotype.Repository;

@Repository
public class OrderDetailDao implements OrderDetailImp{

    public void addOrderDetail(OrderDetail orderDetail){

        Session session= HibernateUtils.getSessionfactory().openSession();
        session.getTransaction().begin();
        session.save(orderDetail);
        session.getTransaction().commit();
        session.close();

    }

}
