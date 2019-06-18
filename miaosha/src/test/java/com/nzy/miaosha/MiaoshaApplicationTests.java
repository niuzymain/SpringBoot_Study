package com.nzy.miaosha;

import com.nzy.miaosha.dao.PasswordMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MiaoshaApplicationTests {
    @Autowired
    private PasswordMapper passwordMapper;

    @Test
    public void contextLoads() {
        passwordMapper.selectByPrimaryKey(1);
    }

}
