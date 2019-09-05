package com.ly.service.impl;

import com.ly.entity.User;
import com.ly.mapper.UserMapper;
import com.ly.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author ly
 * @time 2019/6/29  14:52
 * @description TDDD
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;
    @Override
    public List<User> getAll() {
        return userMapper.getAll();
    }

    @Override
    public void save() {

    }

    @Override
    public boolean delete(Integer userId) {
        return userMapper.delete(userId);
    }

    @Override
    public boolean add(User user) {
        return userMapper.add(user);
    }
}
