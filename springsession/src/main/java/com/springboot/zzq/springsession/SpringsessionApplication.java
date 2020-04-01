package com.springboot.zzq.springsession;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.springboot.zzq.springsession.mapper1.UserMapperOne") ////这里的意思是扫描这个路径下面的所有bean
public class SpringsessionApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringsessionApplication.class, args);
    }

}
