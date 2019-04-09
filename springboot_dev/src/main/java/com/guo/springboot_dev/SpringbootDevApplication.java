package com.guo.springboot_dev;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;


//@SpringBootApplication 一个注解顶下面3个
@SpringBootConfiguration
@EnableAutoConfiguration
@ComponentScan
public class SpringbootDevApplication {

    public static void main(String[] args) {

        SpringApplication.run(SpringbootDevApplication.class, args);
    }

}
