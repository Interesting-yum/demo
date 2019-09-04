package com.ly.service;

import com.ly.entity.User;

import java.util.List;

/**
 * @author ly
 * @time 2019/6/29  14:47
 * @description TDDD
 */
public interface UserService {
    List<User> getAll();

    void save();

    boolean delete(Integer userId);

    boolean add(User user);
}
