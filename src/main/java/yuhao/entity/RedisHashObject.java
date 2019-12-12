package yuhao.entity;

import lombok.*;

import java.io.Serializable;

/**
 * @author 喻浩
 * @create 2019-12-12-16:15
 */
@Setter
@Getter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class RedisHashObject implements Serializable {
    //hash值
    private String hash;
    //key值
    private String key;
    //value值
    private String value;
}
