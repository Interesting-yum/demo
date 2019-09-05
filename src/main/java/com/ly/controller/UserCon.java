package com.ly.controller;

import com.alibaba.fastjson.JSON;
import com.ly.GenderEnum;
import com.ly.entity.User;
import com.ly.entity.UserVO;
import com.ly.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cglib.beans.BeanCopier;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

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

    @PostMapping("/test/get-user-info")
    public List<UserVO> getUserInfo(){
        List<User> userList = userService.getAll();
        Map<Integer, User> collect = userList.stream().collect(Collectors.toMap(User::getUserId,x->x));
        return userList.stream().map(v->{
            UserVO vo = new UserVO();
            vo = JSON.parseObject(JSON.toJSONString(v),UserVO.class);
            vo.setSex(GenderEnum.getDescByName(v.getGender()));
            return vo;
        }).collect(Collectors.toList());
    }
}
