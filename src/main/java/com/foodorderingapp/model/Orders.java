package com.foodorderingapp.model;


import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Orders {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int orderId;


    @OneToMany(mappedBy = "orders")
    private
    List<OrderDetail> orderDetailList=new ArrayList<OrderDetail>();

    @ManyToOne(cascade =CascadeType.ALL)
    @JoinColumn(name="userId")
    private User user;



    public int getOrderId( ) {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public List<OrderDetail> getOrderDetailList() {
        return orderDetailList;
    }

    public void setOrderDetailList(List<OrderDetail> orderDetailList) {
        this.orderDetailList = orderDetailList;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
