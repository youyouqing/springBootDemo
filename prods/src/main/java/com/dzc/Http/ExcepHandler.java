package com.dzc.Http;

import com.dzc.Models.ResultModel;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ExcepHandler {

    // 全局接管异常
    @ExceptionHandler(Exception.class)
    public ResultModel handler(Exception e) {
        return new ResultModel("error",e.getMessage() + "==" + e.getClass().getName());
    }
}
