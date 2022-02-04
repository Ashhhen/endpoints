package com.toolstore.service.impl;

import com.toolstore.database.IUserDAO;
import com.toolstore.model.Tool;
import com.toolstore.model.User;
import com.toolstore.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService implements IUserService {

    @Autowired
    IUserDAO iUserDAO;

    @Override
    public User getUserById(int userId) {
        Optional<User> userOptional = iUserDAO.getUserById(userId);

        if (userOptional.isEmpty()) {
            return null;
        }

        return userOptional.get();
    }

    @Override
    public void addUser(User user) {
        this.iUserDAO.addUser(user);

    }
}