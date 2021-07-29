package com.hxh.demo3;

import com.hxh.demo3.dao.UserDao;
import com.hxh.demo3.entity.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class UserDaoTests extends BasicTests{
    @Autowired
    private UserDao userDao;

    @Test
    public void testFindAll() {
        List<User> all = userDao.findAll();
        System.out.println(all);
    }
}
