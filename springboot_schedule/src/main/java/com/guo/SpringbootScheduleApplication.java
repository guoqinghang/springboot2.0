package com.guo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//@EnableScheduling //开启定时任务，自动扫描
//@EnableAsync //开启异步定时任务
public class SpringbootScheduleApplication {

    public static void main(String[] args) {

        SpringApplication.run(SpringbootScheduleApplication.class, args);
    }

}
