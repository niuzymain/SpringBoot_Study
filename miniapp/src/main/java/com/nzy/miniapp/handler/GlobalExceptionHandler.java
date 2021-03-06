package com.nzy.miniapp.handler;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

/*
全局controller
 */
@ControllerAdvice
public class GlobalExceptionHandler {
    @ExceptionHandler(value = Exception.class)
    @ResponseBody
    private Map<String,Object> exceptionHandler(HttpServletRequest req, Exception e){
        Map<String,Object> map = new HashMap<>();
        map.put("success",false);
        map.put("errormsg",e.getMessage());
        map.put("status","抛出异常");
        return map;
    }
}
