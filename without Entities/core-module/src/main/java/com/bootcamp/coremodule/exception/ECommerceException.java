package com.bootcamp.coremodule.exception;

public class ECommerceException extends  RuntimeException{
  public  ErrorCode errorCode;

    public ECommerceException(ErrorCode errorCode) {
        this.errorCode = errorCode;
    }
}
