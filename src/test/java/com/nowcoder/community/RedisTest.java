package com.nowcoder.community;


import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.StringRedisTemplate;

@SpringBootTest
public class RedisTest {

    @Autowired
    StringRedisTemplate stringRedisTemplate ;

    @Test
    public void test1(){

        stringRedisTemplate.opsForValue().set("dong","dong");


        String dong = stringRedisTemplate.opsForValue().get("dong") ;
        System.out.println(dong);;


    }
}
