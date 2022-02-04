package com.toolstore.service;


import com.toolstore.model.User;

import java.util.List;

public interface IUserService {
    User getUserById(int userId);
    void addUser(User user);
}