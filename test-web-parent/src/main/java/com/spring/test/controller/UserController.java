package com.spring.test.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by Administrator on 2017/11/18.
 */
@Controller
@RequestMapping(value = "user")
public class UserController {

    @RequestMapping(value = "get")
    public ModelAndView get(String name){
        ModelAndView mv = new ModelAndView();
        mv.addObject("name", name);
        mv.setViewName("../get");
        return mv;
    }
}
