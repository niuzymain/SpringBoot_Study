package com.nzy.miaosha.service.impl;

import com.nzy.miaosha.dao.PasswordMapper;
import com.nzy.miaosha.dao.UserMapper;
import com.nzy.miaosha.entity.Password;
import com.nzy.miaosha.entity.User;
import com.nzy.miaosha.service.UserService;
import com.nzy.miaosha.service.model.UserModel;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;
    @Autowired
    private PasswordMapper passwordMapper;

    @Override
    public UserModel getUserById(Integer userid) {
        User user = userMapper.selectByPrimaryKey(userid);
        if(user == null){
            return null;
        }
        Password password = passwordMapper.selectByUserId(userid);
        return convertFromUser(user,password);
    }
    private UserModel convertFromUser(User user, Password password){
        if(user == null){
            return null;
        }
        UserModel userModel = new UserModel();
        BeanUtils.copyProperties(user,userModel);
        if(password != null){
            userModel.setPassword(password.getPassword());
        }
        return userModel;
    }
}
