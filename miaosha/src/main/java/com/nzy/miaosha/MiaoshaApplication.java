package com.nzy.miaosha;

import com.nzy.miaosha.dao.PasswordMapper;
import com.nzy.miaosha.entity.Password;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication(scanBasePackages = {"com.nzy.miaosha"})
@MapperScan("com.nzy.miaosha.dao")
@RestController
public class MiaoshaApplication {
    @Autowired
    private PasswordMapper passwordMapper;

    @RequestMapping(value = "/start", method = RequestMethod.GET)
    public String Start() {
        Password password = passwordMapper.selectByPrimaryKey(1);
        if (password != null) {
            return password.getPassword();
        } else {
            return "null";
        }

    }

    public static void main(String[] args) {
        SpringApplication.run(MiaoshaApplication.class, args);
    }
}
