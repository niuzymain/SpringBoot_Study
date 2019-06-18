package com.nzy.springbootstudy.Spring_condition;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ConditionMain {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ConditionConfig.class);
        ListService listService = context.getBean(ListService.class);
        System.out.println(context.getEnvironment().getProperty("os.name")+":"+listService.showCMD());

    }
}
