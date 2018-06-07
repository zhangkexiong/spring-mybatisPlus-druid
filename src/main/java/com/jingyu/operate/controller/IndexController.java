package com.jingyu.operate.controller;

import com.jingyu.operate.po.User;
import com.jingyu.operate.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class IndexController {
    @Autowired
    private UserService service;
    @RequestMapping("/index")
    public String index() {
        return "index";
    }

    @PostMapping("/user")
    public boolean insertUser(@RequestBody User user) {
        return service.insertUserPO(user);
    }

    @GetMapping("/use/{id}")
    public User getByUserById(@PathVariable("id") Integer id) {
        return service.getById(id);
    }
}
