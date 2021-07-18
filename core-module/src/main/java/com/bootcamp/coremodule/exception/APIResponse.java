package com.bootcamp.coremodule.exception;


import org.springframework.http.HttpStatus;


public class APIResponse {

    private String errorDesc;

    private HttpStatus status;

    private String date;

    public APIResponse(String errorDesc, HttpStatus status, String date) {
        this.errorDesc = errorDesc;
        this.status = status;
        this.date = date;
    }

    public String getErrorDesc() {
        return errorDesc;
    }

    public void setErrorDesc(String errorDesc) {
        this.errorDesc = errorDesc;
    }

    public HttpStatus getStatus() {
        return status;
    }

    public void setStatus(HttpStatus status) {
        this.status = status;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}

