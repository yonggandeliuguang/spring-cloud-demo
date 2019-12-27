package com.yang.service;

import com.yang.model.User;

import java.util.List;

public interface UserService {

    /***
     * 增加数据
     * @param user
     * @return
     */
    int add(User user);

    /***
     * 修改数据
     */
    int update(User user);

    /***
     * 删除数据
     */
    int delete(Integer id);

    /***
     * 单个查询
     */
    User queryOne(Integer id);

    /***
     * 集合查询
     */
    List<User> queryList();
}
