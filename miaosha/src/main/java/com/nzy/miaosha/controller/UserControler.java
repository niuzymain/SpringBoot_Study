package com.nzy.miaosha.controller;

import com.nzy.miaosha.controller.viewobject.UserVO;
import com.nzy.miaosha.error.BusinessException;
import com.nzy.miaosha.error.EnumBusinessError;
import com.nzy.miaosha.response.CommonReturnType;
import com.nzy.miaosha.service.UserService;
import com.nzy.miaosha.service.model.UserModel;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/user")
public class UserControler {
    @Autowired
    private UserService userService;

    @RequestMapping("/get")
    @ResponseBody
    public CommonReturnType getUser(@RequestParam(name = "id") Integer id) throws BusinessException {
        UserModel userModel = userService.getUserById(id);
        if (userModel == null) {
            throw new BusinessException(EnumBusinessError.USER_NOT_EXIST);
        }
        UserVO userVO = convertUserVOFromUserModel(userModel);
        return CommonReturnType.create(userVO);
    }

    private UserVO convertUserVOFromUserModel(UserModel userModel) {
        if (userModel == null) {
            return null;
        }
        UserVO userVO = new UserVO();
        BeanUtils.copyProperties(userModel, userVO);
        return userVO;
    }
    @ExceptionHandler(Exception.class)
    @ResponseStatus(HttpStatus.OK)
    @ResponseBody
    public Object handleException(HttpServletRequest request,BusinessException e){
        CommonReturnType type = new CommonReturnType();
        type.setStatus("fail");
        type.setData(e);
        return type;
    }
}
