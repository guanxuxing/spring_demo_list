package com.test.thread;

/**
 * Created by Administrator on 2018/7/22.
 */
public class UserThread implements Runnable {
    @Override
    public void run() {
        System.out.println("user.thread.run....");
    }
}
