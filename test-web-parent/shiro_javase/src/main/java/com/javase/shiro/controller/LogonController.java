package com.javase.shiro.controller;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by Administrator on 2018/1/6.
 */
@Controller
public class LogonController {

    @RequestMapping(value = "logon")
    public String logon(HttpServletRequest request){
        Subject currentUser = SecurityUtils.getSubject();
        String userName = request.getParameter("user_name");
        String passWord = request.getParameter("pass_word");
        UsernamePasswordToken token = new UsernamePasswordToken(userName, passWord);
        try {
            currentUser.login(token);
            System.out.println("登录成功");
            return "success";
        } catch (AuthenticationException e) {
            System.out.println("登录失败: 用户验证失败");
            return "login";
        }

    }
}
