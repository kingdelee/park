package com.yfkj.park;

import com.alibaba.druid.spring.boot.autoconfigure.DruidDataSourceAutoConfigure;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @Title: Application
 * @Description: TODO
 * @Author: Jiandong.Li
 * @Create: 2019-05-23 17:29
 * @Modified By: Who(When)
 * @Version v1.0
 **/
@SpringBootApplication(exclude = DruidDataSourceAutoConfigure.class)
@MapperScan("com.yfkj.park.dao")
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}
