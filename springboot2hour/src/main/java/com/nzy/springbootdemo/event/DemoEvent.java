package com.nzy.springbootdemo.event;

import org.springframework.context.ApplicationEvent;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;


public class DemoEvent extends ApplicationEvent{

    private String msg;

    public DemoEvent(Object source, String msg) {
        super(source);
        this.msg = msg;
    }

    public String getMsg() {
        return this.msg;
    }
    public void setMsg(String msg) {
        this.msg = msg;
    }
}
