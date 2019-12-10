package yuhao.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 喻浩
 * @create 2019-12-10-20:17
 */
@RestController
public class Test {
    
    @RequestMapping("/test")
    public String test(){
        return "111";
    }
}
