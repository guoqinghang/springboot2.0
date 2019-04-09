package com.guo.task;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

@Component
@Async
public class AyncTask {

    public void task1() throws InterruptedException {

        long beginTime = System.currentTimeMillis();
        Thread.sleep(1000L);
        long endTime = System.currentTimeMillis();

        System.out.println("task1任务耗时："+(endTime-beginTime));
    }
    public void task2() throws InterruptedException {

        long beginTime = System.currentTimeMillis();
        Thread.sleep(2000L);
        long endTime = System.currentTimeMillis();

        System.out.println("task1任务耗时："+(endTime-beginTime));
    }
    public void task3() throws InterruptedException {

        long beginTime = System.currentTimeMillis();
        Thread.sleep(3000L);
        long endTime = System.currentTimeMillis();

        System.out.println("task1任务耗时："+(endTime-beginTime));
    }
}
