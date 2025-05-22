package com.ruoyi.framework.redis;

import org.apache.shiro.cache.Cache;
import org.apache.shiro.cache.CacheException;
import org.apache.shiro.cache.CacheManager;
import org.springframework.data.redis.core.RedisTemplate;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

public class ShiroRedisCacheManager implements CacheManager {
    private final ConcurrentMap<String, Cache> caches = new ConcurrentHashMap<String, Cache>();
    /**
     * cache存活时间
     */
    private long cacheLive;

    /**
     * cache前缀
     */
    private String cacheKeyPrefix;
    private RedisTemplate redisTemplate;

    @Override
    public <K, V> Cache<K, V> getCache(String name) throws CacheException {
        Cache cache = this.caches.get(name);
        if (cache == null) {
            //自定义shiroCache
            cache = new ShiroRedisCache<K, V>(redisTemplate, cacheLive, cacheKeyPrefix);
            this.caches.put(name, cache);
        }
        return cache;
    }

    public void setCacheLive(long cacheLive) {
        this.cacheLive = cacheLive;
    }

    public void setCacheKeyPrefix(String cacheKeyPrefix) {
        this.cacheKeyPrefix = cacheKeyPrefix;
    }

    public void setRedisTemplate(RedisTemplate redisTemplate) {
        this.redisTemplate = redisTemplate;
    }
}