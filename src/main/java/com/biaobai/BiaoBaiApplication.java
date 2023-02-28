package com.biaobai;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@Slf4j
@SpringBootApplication
public class BiaoBaiApplication {
    public static void main(String[] args) {
        System.setProperty("java.awt.headless","false");
        SpringApplication.run(BiaoBaiApplication.class,args);
        log.info("项目运行成功......");
    }
}
