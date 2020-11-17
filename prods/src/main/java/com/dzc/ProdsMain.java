package com.dzc;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;

@SpringBootApplication
// 开启异步调用
@EnableAsync
@MapperScan("com.dzc.Mapper")
public class ProdsMain {
    public static void main(String[] args) {
        SpringApplication.run(ProdsMain.class, args);
    }
}
