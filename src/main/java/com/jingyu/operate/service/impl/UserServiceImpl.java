package com.jingyu.operate.service.impl;

import com.jingyu.operate.mapper.UserMapper;
import com.jingyu.operate.po.User;
import com.jingyu.operate.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;
    @Transactional
    @Override
    public boolean insertUserPO(User user) {
        Integer id = userMapper.insert(user);
        System.out.println(id);
        return true;
    }

    @Override
    public User getById(Integer id) {
        User user = new User();
        return user.selectById(id);
    }
}
