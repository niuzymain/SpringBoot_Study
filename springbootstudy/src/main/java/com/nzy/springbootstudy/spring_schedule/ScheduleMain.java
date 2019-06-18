package com.nzy.springbootstudy.spring_schedule;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ScheduleMain {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ScheduleConfig.class);
        ScheduleService scheduleService = context.getBean(ScheduleService.class);
        scheduleService.repeat();
    }
}
