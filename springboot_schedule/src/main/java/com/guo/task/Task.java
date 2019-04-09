package com.guo.task;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class Task {

    @Scheduled(cron = "${corn}")
    public void task(){
        try {
            Thread.sleep(1000L);
            System.out.println("通过读取配置文件，每秒读取一次");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
