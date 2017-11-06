package com.ldeng.demo.service;

import com.ldeng.demo.model.User;

public interface UserService {
    User createUser(User user);

    User getUserByUsername(String username);
}
