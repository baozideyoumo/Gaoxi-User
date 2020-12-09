package com.gaoxi.redis;

import com.gaoxi.Entity.user.AccessAuthEntity;
import com.gaoxi.Entity.user.UserEntity;
import com.google.common.collect.Maps;

import java.util.Map;

/**
 * @description
 */
public class RedisServiceTemp {

    public static Map<String, AccessAuthEntity> accessAuthMap = Maps.newHashMap();

    public static Map<String, UserEntity> userMap = Maps.newHashMap();
}
