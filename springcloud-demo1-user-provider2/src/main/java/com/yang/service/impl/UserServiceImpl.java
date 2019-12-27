package com.yang.service.impl;

import com.yang.mapper.UserMapper;
import com.yang.model.User;
import com.yang.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    /**
     * 增加数据
     * @param user
     * @return
     */
    @Override
    public int add(User user) {
        return userMapper.add(user);
    }

    /***
     * 修改数据
     * @param user
     * @return
     */
    @Override
    public int update(User user) {
        return userMapper.update(user);
    }

    /***
     * 删除数据
     * @param id
     * @return
     */
    @Override
    public int delete(Integer id) {
        return userMapper.delete(id);
    }

    /***
     * 查询一条记录
     * @param id
     * @return
     */
    @Override
    public User queryOne(Integer id) {
        return userMapper.queryOne(id);
    }

    /***
     * 集合查询
     * @return
     */
    @Override
    public List<User> queryList() {
        return userMapper.queryList();
    }
}