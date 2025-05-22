package com.ruoyi.framework.config;

import com.ruoyi.framework.redis.ShiroRedisCacheManager;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.core.RedisTemplate;

@Configuration
public class ShiroCacheConf {


    @Value("${cache.cacheLive:60}")
    private long cacheLive;


    @Value("${cache.cachePrefix:shiroApp}")
    private String cachePrefix;


    @Bean(name = "redisCacheManager")
    public ShiroRedisCacheManager redisCacheManager(@Qualifier("redisTemplate") RedisTemplate redisTemplate) {
        ShiroRedisCacheManager redisCacheManager = new ShiroRedisCacheManager();
        //cache过期时间及前缀
        redisCacheManager.setCacheLive(cacheLive);
        redisCacheManager.setCacheKeyPrefix(cachePrefix);
        redisCacheManager.setRedisTemplate(redisTemplate);
        return redisCacheManager;
    }

}
