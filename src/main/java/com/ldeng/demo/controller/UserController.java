package com.ldeng.demo.controller;

import com.ldeng.demo.model.User;
import com.ldeng.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(method = RequestMethod.POST)
    public User createUser (@RequestBody User user) {
        return userService.createUser(user);
    }

    @RequestMapping("/{username}")
    @PreAuthorize("hasRole('ROLE_MANAGER')")
    public User getUserByUsername(@PathVariable String username) {
        return userService.getUserByUsername(username);
    }
}

