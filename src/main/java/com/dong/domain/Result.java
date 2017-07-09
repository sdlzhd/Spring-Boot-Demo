package com.dong.domain;

/**
 * Created by dongdong on 17-7-9.
 */
public class Result {
    /**
     * 返回码
     */
    private Integer code;
    /**
     * 提示信息
     */
    private String msg;
    /**
     * 返回内容
     */
    private Object data;

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
