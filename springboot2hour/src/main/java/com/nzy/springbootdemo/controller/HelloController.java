package com.nzy.springbootdemo.controller;

import com.nzy.springbootdemo.entity.Limit;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;

@RestController
@RequestMapping("/hello")
public class HelloController {
    @Autowired
    private Limit limit;

    @GetMapping("/print")
    public String Print(){
        return "min:"+limit.getMinMoney()+",max:"+limit.getMaxMoney()+",des:"+limit.getDes();
    }

    @GetMapping("/printvar/{var}")
    public String Printvar(@PathVariable("var") int var){
        return "var:"+var;
    }

    @GetMapping("/req")
    public String Requestvar(@RequestParam(value = "var",required = false,defaultValue = "78") int var){
        return "reqvar:"+var;
    }

    @GetMapping("/index")
    public String Index(){
        return "index";
    }
}
