package com.test.service;

import com.alibaba.fastjson.JSON;
import com.test.common.RedisConstant;
import com.test.common.RedisService;
import com.test.entity.UserInfo;
import com.test.util.UUIDUtil;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by Administrator on 2018/9/15.
 */
@Service
public class UserSerivceImpl implements UserService {

    @Resource
    private RedisService redisService;

    @Override
    public UserInfo login(HttpServletResponse response, UserInfo user) {
        if ("admin".equals(user.getUserName()) && "123".equals(user.getUserPass())) {
            // 生成一个唯一的会话ID
            String sessionId = UUIDUtil.getUUIID();

            //把生成的会话ID存储到redis
            redisService.set(sessionId, JSON.toJSONString(user));
            //设置redis中key有效期
            redisService.expire(sessionId, RedisConstant.SESSION_TIME_OUT);

            //把指定cookie的ID值发送客户端保存
            Cookie cookie = new Cookie(RedisConstant.COOKIE_NAME, sessionId);
            //设置访问域
           // cookie.setDomain(".gerry.com");
            //访问路径
            cookie.setPath("/");
            //设置有效时间
            cookie.setMaxAge(RedisConstant.SESSION_TIME_OUT);
            //发送到客户端
            response.addCookie(cookie);

        }
        return null;
    }

    @Override
    public UserInfo getTokenByUser(HttpServletRequest request, String token) {
        return null;
    }
}
