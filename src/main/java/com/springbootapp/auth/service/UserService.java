package com.springbootapp.auth.service;

import com.springbootapp.auth.model.User;

public interface UserService {
    void save(User user);

    User findByUsername(String username);
}
