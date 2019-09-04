package com.ly;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.cafuc.ssm.mapper")
public class SpringbootSpringmvcMybatisApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootSpringmvcMybatisApplication.class, args);
    }
}
