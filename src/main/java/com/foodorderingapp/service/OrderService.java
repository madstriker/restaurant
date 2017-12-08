package com.foodorderingapp.service;

import com.foodorderingapp.dao.OrderDao;
import com.foodorderingapp.model.Orders;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {
    @Autowired
    OrderDao orderDao;
    @Autowired
    OrderDetailService orderDetailService;

    public void addOrders(Orders orders){


        orderDao.addOrders(orders);

    }


}
