package com.nzy.springbootstudy.spring_annotation;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AnnottionMain {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AnnotationConfig.class);
        AnnotationService service = context.getBean(AnnotationService.class);
        service.print();
    }
}
