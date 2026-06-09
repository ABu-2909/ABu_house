package com.tj.service.impl;

import com.tj.entity.User;
import com.tj.mapper.UserMapper;
import com.tj.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public List<User> selectAllUser() {
        return userMapper.selectAllUser();
    }

    @Override
    public User selectUser(User user) {
        return userMapper.selectUser(user);
    }
}
