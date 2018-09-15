package com.test.spring;

import com.test.common.RedisService;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Administrator on 2018/9/15.
 */
public class RedisTest {

    @Test
    public void testRedisClient(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring_mvc.xml");
        RedisService redisService = (RedisService) context.getBean("redisServiceImpl");
        redisService.set("name", "gxx");
        System.out.println("----- " + redisService.get("name"));

    }
}
