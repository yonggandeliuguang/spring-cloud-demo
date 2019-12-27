package com.yang.mapper;

import com.yang.model.User;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

public interface UserMapper {

    /***
     * 增加数据
     * @param user
     * @return
     */
    @Insert("insert into user(id,username) values(#{id},#{username})")
    int add(User user);


    /***
     * 修改数据
     */
    @Update("update user set username=#{username} where id=#{id}")
    int update(User user);

    /***
     * 删除数据
     */
    @Delete("delete from user where id=#{id}")
    int delete(Integer id);


    /***
     * 单个查询
     */
    @Select("select * from user where id=#{id}")
    User queryOne(Integer id);


    /***
     * 集合查询
     */
    @Select("select * from user")
    List<User> queryList();
}