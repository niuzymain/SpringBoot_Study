package com.nzy.miaosha.dao;


import com.nzy.miaosha.entity.User;
import org.apache.ibatis.annotations.Param;

public interface UserMapper {
    User selectByPrimaryKey(@Param("userid") Integer userid);
}