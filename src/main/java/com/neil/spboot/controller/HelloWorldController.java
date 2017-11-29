package com.neil.spboot.controller;

import com.neil.spboot.domain.User;
import lombok.Value;
import lombok.extern.log4j.Log4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author nibaoshan
 * @create 2017-11-29 11:29
 * @desc
 **/

@Log4j
@RestController
@RequestMapping(value = "/", produces = "application/json; charset=utf-8")
public class HelloWorldController {
    @RequestMapping("/hello")
    public String  index(){
        return "spring boot,开始学习java!";
    }

    @RequestMapping("/getUser")
    public User getUser(){

        User user= User.builder()
                .userName("小明")
                .password("xxxx")
                .build();
        log.info("请求 /getUser 接口 user:{}"  );
        return user;
    }
}
