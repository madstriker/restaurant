package com.foodorderingapp.controller;


import com.foodorderingapp.model.User;
import com.foodorderingapp.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {
    @Autowired
    UserService userService;



    @RequestMapping(value={"/verify"},method= RequestMethod.POST)
    @ResponseBody
    public String verifyUser(@RequestBody User user){

        return userService.verifyUser(user);
    }

}
