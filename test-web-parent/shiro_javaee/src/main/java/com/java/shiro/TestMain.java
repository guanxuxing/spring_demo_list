package com.java.shiro;

/**
 * Created by Administrator on 2018/1/7.
 */
public class TestMain {

    public static void main(String[] args){
        String str = "411121199011074511";
        String str1 = "411121199011074512";
        String one = str1.substring(0,8);
        String two = str1.substring(9,12);
        String third = str1.substring(13, str1.length());
        str1 = one + "****" + third;
        System.out.println(str1);


    }
}
