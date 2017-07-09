package com.dong.Exception;

import com.dong.enums.ResultEnum;

/**
 * Created by dongdong on 17-7-9.
 */
public class DemoException extends RuntimeException {
    private Integer code;


    /**
     * @param resultEnum 错误枚举
     */
    public DemoException(ResultEnum resultEnum) {
        super(resultEnum.getMsg());
        this.code = resultEnum.getCode();
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }
}
