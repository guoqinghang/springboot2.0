package com.guo.controller;

import com.guo.task.AyncTask;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/task")
public class TaskController {

    @Autowired
    private AyncTask ayncTask;

    @GetMapping("ayncTask")
    public Object exceTask() throws InterruptedException {
        long begin = System.currentTimeMillis();
        ayncTask.task1();
        ayncTask.task2();
        ayncTask.task3();
        long end = System.currentTimeMillis();
        long total = end - begin;
        System.out.println("总耗时："+total);
        return total;
    }
}
