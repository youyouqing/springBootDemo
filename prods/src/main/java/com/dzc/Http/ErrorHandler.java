package com.dzc.Http;

import com.dzc.Models.ResultModel;
import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;

@RestController
public class ErrorHandler implements ErrorController {

    @RequestMapping(path = "/error")
    public ResultModel error(HttpServletResponse resp)
    {
        return new ResultModel("error", "http code:" + resp.getStatus());
    }

    @Override
    public String getErrorPath() {
        return null;
    }
}
