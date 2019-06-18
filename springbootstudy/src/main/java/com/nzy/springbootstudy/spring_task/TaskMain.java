package com.nzy.springbootstudy.spring_task;

import com.nzy.springbootstudy.spring_aware.AwareConfig;
import com.nzy.springbootstudy.spring_aware.AwareService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TaskMain {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(TaskConfig.class);
        TaskService taskService = context.getBean(TaskService.class);
        for(int i = 1;i<444;i++){
            taskService.executeTask(i);
//            taskService.executeTaskPlus(i);
        }
        context.close();

    }
}
