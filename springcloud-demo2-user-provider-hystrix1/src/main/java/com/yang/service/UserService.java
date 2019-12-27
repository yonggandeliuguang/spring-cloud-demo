package com.yang.service;

import com.yang.model.User;

public interface UserService {

    User queryOne(Integer id);

    Integer add(User user);
}
