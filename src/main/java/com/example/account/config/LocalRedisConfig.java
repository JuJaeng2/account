package com.example.account.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import redis.embedded.RedisServer;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Configuration
public class LocalRedisConfig { // Redis를 띄워주기만 하는 부분이다. 따로 동작을 위한 코드작성을 다른 클래스에 작성해야한ㄷ. => RedisRepsitoryConfig
    @Value("${spring.redis.port}") // 설정 파일에 있는 레디스 포트를 가져와서 redisPort 변수에 넣어준다.
    private int redisPort;

    private RedisServer redisServer;

    @PostConstruct
    public void startRedis(){
        redisServer = new RedisServer(redisPort);
        redisServer.start();
    }

    @PreDestroy
    public void stopRedis(){
        if(redisServer != null){
            redisServer.stop();
        }
    }
}
