package com.dong.handle;

import com.dong.Exception.DemoException;
import com.dong.domain.Result;
import com.dong.utils.ResultUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by dongdong on 17-7-9.
 */
@ControllerAdvice
public class ExceptionHandle {

    private final static Logger logger = LoggerFactory.getLogger(ExceptionHandle.class);

    /**
     * 自定义异常处理
     *
     * @param e
     * @return
     */
    @ExceptionHandler(Exception.class)
    @ResponseBody
    public Result handle(Exception e) {
        // 判断是否是 自定义的 Exception
        if (e instanceof DemoException) {
            DemoException demoException = (DemoException) e;
            return ResultUtil.error(demoException.getCode(), demoException.getMessage());
        } else {
            logger.error("【系统异常】{}", e);
            return ResultUtil.error(500, "未知错误");
        }

    }
}
