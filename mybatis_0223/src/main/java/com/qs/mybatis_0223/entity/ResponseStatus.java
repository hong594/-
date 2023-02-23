package com.qs.mybatis_0223.entity;

/**
 * @开发者 (周明)
 * @创建日期 2023-02-22 09:50
 * @开发版本 1.0
 * @开发机构 千硕教育
 */
public enum ResponseStatus { //模拟HttpStatus枚举类
    OK(200,"请求成功"),
    INTERNAL_ERROR(500,"服务器内部错误"),
    LOGIN_ERROR(500001,"账号或密码错误"),
    BUSINESS_ERROR(500002,"业务错误"),
    AUTHORITY_ERROR(500003,"授权错误"),
    AUTHENTICATE_ERROR(403,"验证错误，需要登录"),
    Find_NULL(500088,"没有记录"),
    DELETE_FAIL(500060,"删除失败"),
    UPDATE_FAIL(500061,"修改失败"),
    ADD_FAIL(500062,"添加失败");

    private int code;
    private String message;

    ResponseStatus(int code, String message) {
        this.code = code;
        this.message = message;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
