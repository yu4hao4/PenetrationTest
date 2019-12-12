package yuhao.utils;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.data.redis.core.HashOperations;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Component;
import yuhao.entity.RedisHashObject;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author 喻浩
 * @create 2019-12-12-16:00
 */
//@Lazy
@Component
public class RedisUtil {
    // redis 操作对象
    @Resource
    RedisTemplate<String, String> redisTemplate;

    /**
     * 对 Redis 数据库进行 单个 Hash 的写
     * @return
     */
    public boolean putHashData(RedisHashObject redisHashObject){
        try {
            //向 redis 数据库放入 hash
            redisTemplate.opsForHash().put(
                    redisHashObject.getHash(),
                    redisHashObject.getKey(),
                    redisHashObject.getValue()
            );
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
    
    public boolean putMoreHashData(List<RedisHashObject> list){
        for(RedisHashObject obj : list){
            //向 redis 数据库放入 hash
            redisTemplate.opsForHash().put(
                    obj.getHash(),
                    obj.getKey(),
                    obj.getValue()
            );
        }
        return true;
    }

    /**
     * 删除对应的 hash
     * @param key
     * @return
     */
    public boolean deleteHash(String key){
        return redisTemplate.delete(key);
    }

    /**
     * 删除某个 hash 中的 key
     * @param hash
     * @param args
     * @return
     */
    public boolean removeHashKeys(String hash,Object... args){
        return redisTemplate.opsForHash().delete(hash,args) > 0 ? true : false;
    }

    /**
     * 获得 hash 和 key 对应的 value
     * @param redisHashObject
     * @return
     */
    public Object getValueForHashAndKey(RedisHashObject redisHashObject){
        return redisTemplate.opsForHash().get(
                redisHashObject.getHash(), redisHashObject.getKey()
        );
    }
}
