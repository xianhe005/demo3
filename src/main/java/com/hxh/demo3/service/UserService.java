package com.hxh.demo3.service;

import com.hxh.demo3.entity.User;

import java.util.List;

public interface UserService {

    List<User> findAll();

    void save(User user);
}
