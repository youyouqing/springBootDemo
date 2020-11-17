package com.dzc.Models;

public class ResultModel {

    private String status;

    private Object result;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Object getResult() {
        return result;
    }

    public void setResult(Object result) {
        this.result = result;
    }

    public ResultModel(String status, Object result) {
        this.status = status;
        this.result = result;
    }

}
