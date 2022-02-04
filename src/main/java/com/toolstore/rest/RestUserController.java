package com.toolstore.rest;

import com.toolstore.model.Tool;
import com.toolstore.model.User;
import com.toolstore.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/rest")
public class RestUserController {

    @Autowired
    IUserService iUserService;

    @RequestMapping(value = "/user/{id}", method = RequestMethod.GET)
    public User getUser(@PathVariable int id) {
        User user = iUserService.getUserById(id);

        return user;
    }

    @RequestMapping(value = "/user/adduser", method = RequestMethod.POST)
    public void addUser(@RequestBody User user) {iUserService.addUser(user);}
}