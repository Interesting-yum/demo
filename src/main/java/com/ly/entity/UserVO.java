package com.ly.entity;

import lombok.Data;

/**
 * @author ly
 * @time 2019/9/5  0:27
 * @description 用户信息视图对象
 */
@Data
public class UserVO {
    private String userName;    //用户姓名
    private String loginName;   //用户名
    private String sex;     //性别
}
