package com.jingyu.operate.service;

import com.jingyu.operate.po.User;

public interface UserService {
    boolean insertUserPO(User user);

    User getById(Integer id);
}
