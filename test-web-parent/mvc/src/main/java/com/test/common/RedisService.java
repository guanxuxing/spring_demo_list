package com.test.common;

/**
 * Created by Administrator on 2018/9/15.
 */
public interface RedisService {

    boolean set (String key, String value);

    String get (String key);

    void delete (String key);

    boolean expire (String key, long time);
}
