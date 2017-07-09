package com.dong.enums;

/**
 * Created by dongdong on 17-7-9.
 */
public enum ResultEnum {

    UNKNOW_ERROR(-1, "未知错误"),

    SUCCESS(200000, "OK"),

    DEMO_ERROR(300001, "名字有点长");

    private Integer code;
    private String msg;

    ResultEnum(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public Integer getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }
}
