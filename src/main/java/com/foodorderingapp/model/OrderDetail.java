package com.foodorderingapp.model;

import javax.persistence.*;

@Entity
public class OrderDetail {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int orderDetailId;
    private int quantity;

    @ManyToOne
    @JoinColumn(name="orderId")
    private Orders orders;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="foodId")
    private Food food;



    public int getOrderDetailId() {
        return orderDetailId;

    }

    public void setOrderDetailId(int orderDetailId) {
        this.orderDetailId = orderDetailId;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Orders getOrders() {
        return orders;
    }

    public void setOrders(Orders orders) {
        this.orders = orders;
    }

    public Food getFood() {
        return food;
    }

    public void setFood(Food food) {
        this.food = food;
    }
}
