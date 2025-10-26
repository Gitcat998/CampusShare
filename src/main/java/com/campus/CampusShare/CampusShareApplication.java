package com.campus.CampusShare;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


/**
 * Spring Boot 应用启动类
 * @author 重庆财经学院实训团队
 * @since 2025-10-26
 */
@SpringBootApplication
@MapperScan("com.campus.CampusShare.mapper")

public class CampusShareApplication {

    public static void main(String[] args) {
        SpringApplication.run(CampusShareApplication.class, args);
    }

}