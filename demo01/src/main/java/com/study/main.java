package com.study;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@MapperScan("com.study.mapper")
public class main {
    public static void main(String[] args) {
        SpringApplication.run(main.class);
    }
}
