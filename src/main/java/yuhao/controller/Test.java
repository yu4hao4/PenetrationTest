package yuhao.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import yuhao.entity.RedisHashObject;
import yuhao.entity.RespBean;
import yuhao.utils.RedisUtil;

/**
 * @author 喻浩
 * @create 2019-12-10-20:17
 */
@RestController
public class Test {
    
//    @RequestMapping("/test")
//    public String test(){
//        return "111";
//    }

    @Autowired
    RedisUtil redisUtil;
    
    @PostMapping("/set")
    public RespBean set(@RequestBody RedisHashObject hashObject){
        System.out.println(hashObject);
        redisUtil.putHashData(hashObject);
        return RespBean.ok("ok");
    }
    
    @PostMapping("/get")
    public RespBean get(@RequestBody RedisHashObject redisHashObject){
        return RespBean.ok("ok").setObj(redisUtil.getValueForHashAndKey(redisHashObject));
    }
}
