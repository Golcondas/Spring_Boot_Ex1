package com.neil.spboot.controller;

import com.neil.spboot.domain.User;
import com.neil.spboot.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author nibaoshan
 * @create 2017-11-29 14:30
 * @desc
 **/
@RestController
@RequestMapping(value = "/",produces = "application/json; charset=utf-8")
public class NeilController {
    @Autowired
    private UserRepository userRepository;

    @RequestMapping("/neil")
    public String  index(){
        return "neil开始学习java!";
    }

    @RequestMapping("/saveUser")
    public String saveUser(){
        User user=User.builder()
            .userName("帅").build();
        userRepository.save(user);
        return "q添加成功q";
    }
}
