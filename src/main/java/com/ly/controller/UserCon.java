package com.ly.controller;

import com.ly.entity.User;
import com.ly.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author ly
 * @time 2019/6/29  14:57
 * @description TODO
 */
@RestController
public class UserCon {
    @Autowired
    public UserService userService;

    @RequestMapping(value = "user",method = RequestMethod.GET)
    public List<User> getAll(){
        return userService.getAll();
    }

    @RequestMapping(value = "user",method = RequestMethod.DELETE)
    public boolean del(@RequestParam(value="userId")Integer userId){
        return userService.delete(userId);
    }
    @RequestMapping(value = "user",method = RequestMethod.POST)
    public boolean add(@RequestBody User user){
        return userService.add(user);
    }
}
