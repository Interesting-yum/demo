package com.ly.entity;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * @author ly
 * @time 2019/6/29  14:40
 * @description TDDD
 */
@Data
public class User implements Serializable {
    private Integer userId;     //用户主键
    private String userName;    //用户姓名
    private String loginName;   //用户名
    private String password;    //密码
    private Integer gender;     //性别

    public User(){}
    public User(Integer userId,String userName,Integer gender){
        this.userId = userId;
        this.userName = userName;
        this.gender = gender;
    }
}
