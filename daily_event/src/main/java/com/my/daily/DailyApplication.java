package com.my.daily;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author 10068921(LgyTT)
 * @description:
 * @date 2019/1/3 11:21
 **/
@SpringBootApplication
public class DailyApplication {
    public static void main(String[]args){
        SpringApplication.run(DailyApplication.class,args);
    }
}
