package com.tj.service;

import com.tj.entity.User;

import java.util.List;

public interface UserService {
    public List<User> selectAllUser();

    User selectUser(User user);
}
