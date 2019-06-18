package com.nzy.springbootstudy.spring_annotation;

import org.springframework.stereotype.Service;

@Service
public class AnnotationService {
    public void print(){
        System.out.println("success getbean");
    }
}
