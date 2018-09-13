package com.test.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by Administrator on 2018/7/15.
 */
@Controller
@RequestMapping(value = "user")
public class UserController {

    @ResponseBody
    @RequestMapping(value = "get")
    public String get(String[] args){
        return "get";
    }
}
