package com.nzy.springbootstudy.spring_task;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

@Service
public class TaskService {
    @Async
    public void executeTask(Integer i){
        System.out.println("executor:"+i);
    }

    @Async
    public void executeTaskPlus(Integer i){
        System.out.println("executor:"+(i+1));
    }
}
