package com.hxh.demo3;

import com.hxh.demo3.entity.User;
import com.hxh.demo3.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class UserServiceTests extends BasicTests {

    @Autowired
    private UserService userService;

    @Test
    public void testFindAll() {
        List<User> all = userService.findAll();
        System.out.println(all);
    }
}
