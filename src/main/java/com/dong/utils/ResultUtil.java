package com.dong.utils;

import com.dong.domain.Result;

/**
 * Created by dongdong on 17-7-9.
 */
public class ResultUtil {
    public static Result success(Object object) {
        Result result = new Result();
        result.setCode(200000);
        result.setMsg("OK");
        result.setData(object);
        return result;
    }

    public static Result success(){
        return success(null);
    }

    public static Result error(Integer code,String msg){
        Result result = new Result();
        result.setCode(code);
        result.setMsg(msg);
        return result;
    }
}
