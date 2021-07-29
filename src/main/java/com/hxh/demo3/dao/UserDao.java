package com.hxh.demo3.dao;

import com.hxh.demo3.entity.User;

import java.util.List;

public interface UserDao {

    /**
     * 查询所有
     */
    List<User> findAll();

    /**
     * save user
     */
    void save(User user);
}
