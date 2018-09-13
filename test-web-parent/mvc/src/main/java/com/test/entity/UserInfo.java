package com.test.entity;

import com.maven.deploy.jar.UserUtil;
import com.test.thread.UserThread;
import lombok.Data;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by Administrator on 2018/7/22.
 */
@Data
public class UserInfo {

    private String userName;

   public static ExecutorService fixedThreadPool = Executors.newFixedThreadPool(3);

    public static void main(String[] args){
        UserUtil.show();
        ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");
        UserInfo userInfo = (UserInfo) context.getBean("userInfo");
        System.out.println(userInfo.getUserName());


        ThreadPoolTaskExecutor threadPoolTaskExecutor = (ThreadPoolTaskExecutor)context.getBean("threadPool");

      /*  threadPoolTaskExecutor.execute(new UserThread());*/

        fixedThreadPool.execute(new UserThread());



    }
}
