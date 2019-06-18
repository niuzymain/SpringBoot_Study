package com.nzy.miaosha.error;

public enum EnumBusinessError implements CommonError {
    PARAMETER_VALIDATION_ERROR(000001, "参数不合法"),
    USER_NOT_EXIST(100001, "用户不存在");

    private int errCode;
    private String errMsg;

    private EnumBusinessError(int errCode, String errMsg) {
        this.errCode = errCode;
        this.errMsg = errMsg;
    }

    @Override
    public int getErrorCode() {
        return this.errCode;
    }

    @Override
    public String getErrorMsg() {
        return this.errMsg;
    }

    @Override
    public CommonError setErrorMsg(String errorMsg) {
        this.errMsg = errorMsg;
        return this;
    }
}
