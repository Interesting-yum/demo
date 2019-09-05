package com.ly.controller;

import com.ly.base.controller.BaseController;
import com.ly.base.util.RedisConstants;
import com.ly.base.util.RedisUtil;
import com.ly.base.util.StateParameter;
import com.ly.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author ly
 * @time 2019/8/6  22:13
 * @description Redis控制类
 */
@Controller
@RequestMapping("/redis")
public class RedisController extends BaseController {
    @Autowired
    private RedisUtil redisUtil;

    /**
     * @auther: ly
     * @date: 17:26 2018/8/28
     * @param: []
     * @return: org.springframework.ui.ModelMap
     * @Description: 测试redis存储&读取
     */
    @RequestMapping(value="/test")
    @ResponseBody
    public ModelMap test(){
        try {
            redisUtil.set("redisTemplate","这是一条测试数据", RedisConstants.datebase2);
            String value = redisUtil.get("redisTemplate",RedisConstants.datebase2).toString();
            logger.info("redisValue="+value);
            logger.info("读取redis成功");
            return getModelMap(StateParameter.SUCCESS, value, "操作成功");
        } catch (Exception e) {
            e.printStackTrace();
            return getModelMap(StateParameter.FAULT, null, "操作失败");
        }
    }

    @RequestMapping(value="/setUser")
    @ResponseBody
    public ModelMap setUser(){
        try {
            User user = new User(1,"李四",33);
            redisUtil.set("user",user, RedisConstants.datebase1);
            User res = (User)redisUtil.get("user",RedisConstants.datebase1);
            logger.info("res="+res.toString());
            logger.info("读取redis成功");
            return getModelMap(StateParameter.SUCCESS, res, "操作成功");
        } catch (Exception e) {
            e.printStackTrace();
            return getModelMap(StateParameter.FAULT, null, "操作失败");
        }
    }
}
