package com.foodorderingapp.service;

import com.foodorderingapp.dao.OrderDetailDao;
import com.foodorderingapp.model.OrderDetail;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderDetailService {
    @Autowired
    OrderDetailDao orderDetailDao;

    public void addOrderDetail(OrderDetail orderDetail){
        orderDetailDao.addOrderDetail(orderDetail);
    }

}
