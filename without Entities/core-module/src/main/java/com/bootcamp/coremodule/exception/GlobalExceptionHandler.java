package com.bootcamp.coremodule.exception;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import java.text.DateFormat;
import java.util.Date;

@ControllerAdvice
@RestController
public class GlobalExceptionHandler
        extends ResponseEntityExceptionHandler {

    @Autowired
    DateFormat dateFormat;

    @Override
    protected ResponseEntity<Object> handleMethodArgumentNotValid
            (MethodArgumentNotValidException ex, HttpHeaders headers, HttpStatus status, WebRequest request) {
        APIResponse exceptionResponse = new APIResponse(ex.getMessage(), status,dateFormat.format(new Date()));
        return new ResponseEntity(exceptionResponse, HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(ECommerceException.class)
    public final ResponseEntity<Object> handleECommerceExceptions(ECommerceException exception) {
        APIResponse apiResponse = new APIResponse(exception.errorCode.getErrorDesc(), exception.errorCode.getStatusCode(),dateFormat.format(new Date()));
        return new ResponseEntity(apiResponse, exception.errorCode.getStatusCode());
    }
}