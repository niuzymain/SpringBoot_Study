package com.nzy.miaosha.service.model;

public class UserModel {
    private Integer userId;
    private String userName;
    private String phone;
    private String registerMode;
    private String thirdpayId;
    private String password;

    public Integer getUserId() {
        return this.userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return this.userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPhone() {
        return this.phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getRegisterMode() {
        return this.registerMode;
    }

    public void setRegisterMode(String registerMode) {
        this.registerMode = registerMode;
    }

    public String getThirdpayId() {
        return this.thirdpayId;
    }

    public void setThirdpayId(String thirdpayId) {
        this.thirdpayId = thirdpayId;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
