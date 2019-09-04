package com.ly.web;

import com.ly.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author ly
 * @time 2019/6/29  13:49
 * @description TDDD
 */
@Controller
public class helloController {
    @Autowired
    private UserService userService;

    @RequestMapping("/show")
    public String hello(){
        return "index";
    }
}
