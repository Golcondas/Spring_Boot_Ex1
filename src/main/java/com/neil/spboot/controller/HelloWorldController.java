package com.neil.spboot.controller;

import com.neil.spboot.domain.User;
import com.neil.spboot.repository.UserRepository;
import lombok.Value;
import lombok.extern.log4j.Log4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.persistence.Cacheable;
import javax.servlet.http.HttpSession;
import java.util.UUID;

/**
 * @author nibaoshan
 * @create 2017-11-29 11:29
 * @desc
 **/

@Log4j
@RestController
@RequestMapping(value = "/", produces = "application/json; charset=utf-8")
public class HelloWorldController {
    @Autowired
    private UserRepository userRepository;

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

    @RequestMapping("/getCacheUser")
    public User getCacheUser(){
        User user=userRepository.findByUserName("aa");
        System.out.println("若下面没出现“无缓存的时候调用”字样且能打印出数据表示测试成功");
        return user;
    }

    @RequestMapping("/uid")
    public String uid(HttpSession session) {
        UUID uid = (UUID) session.getAttribute("uid");
        if (uid == null) {
            uid = UUID.randomUUID();
        }
        session.setAttribute("uid", uid);
        return session.getId();
    }
}
