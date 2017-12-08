package com.foodorderingapp.service;

import com.foodorderingapp.dao.UserDao;
import com.foodorderingapp.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    UserDao userDao;

    public void addUser(User user) {

        userDao.addUser(user);
    }



    public String verifyUser(User user){

        user.setUserName(user.getUserName());
        user.setUserPassword(user.getUserPassword());
        User verifyuser=userDao.verifyUser(user);

        if (verifyuser == null) {

            return "user not found";

        }else{

            return "user found";
        }
    }



}
