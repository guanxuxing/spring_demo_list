package com.test.util;

import java.util.UUID;

/**
 * Created by Administrator on 2018/9/15.
 */
public class UUIDUtil {

    public static String getUUIID() {
        return UUID.randomUUID().toString().replace("-", "").toUpperCase();
    }
}
