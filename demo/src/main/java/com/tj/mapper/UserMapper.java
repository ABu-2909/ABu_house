package com.tj.mapper;

import com.tj.entity.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserMapper {
    public List<User> selectAllUser();

    User selectUser(User user);

}
