package com.javase.shiro.controller;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.apache.shiro.authz.annotation.RequiresRoles;
import org.apache.shiro.config.IniSecurityManagerFactory;
import org.apache.shiro.mgt.SecurityManager;
import org.apache.shiro.subject.Subject;
import org.apache.shiro.util.Factory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by Administrator on 2018/1/6.
 */
@Controller(value = "user")
public class UserController {


    @RequiresPermissions("test")
    @RequiresRoles("test")
    @RequestMapping(value = "get")
    public String get(){
        //loginWeb();
        return ".......jsp";
    }

    @RequiresRoles("show")
    @ResponseBody
    @RequestMapping(value = "showList")
    public String showList (){
        return "showList";
    }

    @ResponseBody
    @RequestMapping(value = "list")
    public Exception list () throws Exception{
        String str = null;
        return new Exception("测试异常");
    }

    public String loginWeb(){
        Factory factory = new IniSecurityManagerFactory("classpath:TestShiro.ini");
        SecurityManager securityManager = (SecurityManager) factory.getInstance();
        SecurityUtils.setSecurityManager(securityManager);
        UsernamePasswordToken token = new UsernamePasswordToken("gxx", "abc123");
        token.setRememberMe(true);
        Subject currentUser = SecurityUtils.getSubject();
        try {
            currentUser.login(token);
            System.out.println("登录成功");
        } catch (AuthenticationException e) {
            System.out.println("验证失败");
        }
        return "success";
    }
}
