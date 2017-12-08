package com.foodorderingapp.controller;

import com.foodorderingapp.dto.OrderDto;
import com.foodorderingapp.model.Food;
import com.foodorderingapp.model.OrderDetail;
import com.foodorderingapp.model.Orders;
import com.foodorderingapp.model.User;
import com.foodorderingapp.service.FoodService;
import com.foodorderingapp.service.OrderDetailService;
import com.foodorderingapp.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderController {

    @Autowired
    FoodService foodService;
    @Autowired
    OrderDetailService orderDetailService;
    @Autowired
    OrderService orderService;

    @RequestMapping(value="/addOrder" , method = RequestMethod.POST)
    public void addOrders(@RequestBody OrderDto orderDto){

        Orders orders=new Orders();
        Food food=new Food();
        User user=new User();
        OrderDetail orderDetail=new OrderDetail();

        food.setFoodName(orderDto.getFoodName());
        food.setFoodPrice(orderDto.getFoodPrice());
        user.setUserName(orderDto.getUserName());
        user.setAddress(orderDto.getAddress());
        user.setEmail(orderDto.getEmail());
        user.setUserPassword(orderDto.getUserPassword());
        user.setUserRole(orderDto.getUserRole());
        orders.setUser(user);
        orderDetail.setQuantity(orderDto.getQuantity());
        orderDetail.setOrders(orders);
        orderDetail.setFood(food);
        orderService.addOrders(orders);
        orderDetailService.addOrderDetail(orderDetail);


    }
}
