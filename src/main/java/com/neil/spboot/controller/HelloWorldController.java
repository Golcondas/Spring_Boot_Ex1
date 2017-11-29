package com.neil.spboot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author nibaoshan
 * @create 2017-11-29 11:29
 * @desc
 **/
@RestController
@RequestMapping(value = "/", produces = "application/json; charset=utf-8")
public class HelloWorldController {
    @RequestMapping("/hello")
    public String  index(){
        return "spring boot,开始学习java!";
    }
}
