package com.test.service;

import com.test.entity.UserInfo;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by Administrator on 2018/9/15.
 */
public interface UserService {

    /***
     * 定义登录方法
     * @param user
     * @return
     */
    UserInfo login(HttpServletResponse response,UserInfo user);

    /***
     * 根据token获取应用对象
     * @param request
     * @param token
     * @return
     */
    UserInfo getTokenByUser(HttpServletRequest request, String token);
}
