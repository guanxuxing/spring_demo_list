package com.java.shiro;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.config.IniSecurityManagerFactory;
import org.apache.shiro.mgt.SecurityManager;
import org.apache.shiro.subject.Subject;
import org.apache.shiro.util.Factory;

/**
 * Created by Administrator on 2018/1/6.
 */
public class ShiroTest {
    public static void main(String[] args){
        Factory<SecurityManager> factory = new IniSecurityManagerFactory("classpath:TestShiro.ini");
        SecurityManager securityManager = factory.getInstance();
        SecurityUtils.setSecurityManager(securityManager);
        UsernamePasswordToken token = new UsernamePasswordToken("javass", "cc");
        token.setRememberMe(true);
        Subject currentUser = SecurityUtils.getSubject();
        try {
            currentUser.login(token);
            System.out.println("登录成功");
        } catch (AuthenticationException e) {
            System.out.println("认证失败");
        }

    }
}
