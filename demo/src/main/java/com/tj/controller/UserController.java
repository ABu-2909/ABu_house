package com.tj.controller;

import com.tj.entity.User;
import com.tj.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/User")
public class UserController {
    @Autowired
    private UserService UserService;

    /**
     * 获取所有学生列表返回前端
     * @return
     */
    @RequestMapping("/getUsers")
    public List<User> getUser() {
        //调用UserService
        List<User> Users = UserService.selectAllUser();
        return Users;
    }

    /**
     * 学生登录
     * @param user
     * @return
     */
    @RequestMapping("/login")
    public User login(@RequestBody User user) {
        System.out.println(user);
        User use = UserService.selectUser(user);
        return use;
    }

}
