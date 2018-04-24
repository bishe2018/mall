package org.linlinjava.litemall.wx;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages={"org.linlinjava.litemall.wx","org.linlinjava.litemall.db"})
@MapperScan("org.linlinjava.litemall.db.dao")
public class WXAPIApplication {

    public static void main(String[] args) {
        SpringApplication.run(WXAPIApplication.class, args);
    }

}