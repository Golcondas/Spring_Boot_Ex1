package com.neil.spboot.controller;

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
    @RequestMapping("/neil")
    public String  index(){
        return "neil开始学习java!";
    }
}
