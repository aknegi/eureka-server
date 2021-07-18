package com.bootcamp.coremodule.exception;

import org.springframework.http.HttpStatus;


public enum ErrorCode {
    USER_NOT_FOUND("User does not exist in the database", HttpStatus.NOT_FOUND, 404),
    ADDRESS_NOT_FOUND("Address not found in the database", HttpStatus.NOT_FOUND, 404),
    ORDER_NOT_FOUND("order not found for give id", HttpStatus.NOT_FOUND, 404),
    USER_ALREADY_EXISTS("User already exist in the system", HttpStatus.FOUND, 302),
    PASSWORD_NOT_CORRECT("password is incorrect", HttpStatus.BAD_REQUEST, 400),
    USER_NOT_ACTIVE("User is not active", HttpStatus.UPGRADE_REQUIRED, 426),
    ACTIVATED_TOKEN("Your account is already activated", HttpStatus.BAD_REQUEST, 400),
    LABEL_NOT_FOUND("Enter OFFICE or HOME as label", HttpStatus.NOT_ACCEPTABLE, 403),
    METHOD_NOT_FOUND("Enter Payment method COD, UPI or Card", HttpStatus.NOT_ACCEPTABLE, 403),
    USER_IS_LOCKED("User account is locked for 24 Hours", HttpStatus.UPGRADE_REQUIRED, 426),
    COMPANY_ALREADY_EXISTS("Company with same name already exists in the system", HttpStatus.FOUND, 302),
    GST_ALREADY_EXISTS("same GST already exists in the system", HttpStatus.FOUND, 302),
    Field_ALREADY_EXISTS("Field already exists with name", HttpStatus.FOUND, 302),
    PRODUCT_OUT_OF_STOCK("product out of stock", HttpStatus.INTERNAL_SERVER_ERROR, 500),
    PASSWORDS_NOT_SAME("Password and Confirm password are not same", HttpStatus.NOT_ACCEPTABLE, 403),
    INVALID_FIELDS("Field is not present", HttpStatus.BAD_REQUEST, 400),
    INVALID_TOKEN("Your Token is Invalid Please enter a valid token", HttpStatus.FORBIDDEN, 403),
    USER_IS_ADMIN("Cannot make changes, this user is Admin", HttpStatus.NOT_ACCEPTABLE, 406),
    FORBIDDEN("Your are not authorized for this path", HttpStatus.FORBIDDEN, 403),
    CATEGORY_ALREADY_EXISTS("Category already exists", HttpStatus.BAD_REQUEST, 400),
    PRODUCT_ALREADY_EXISTS("Product already exists", HttpStatus.BAD_REQUEST, 400),
    PRODUCT_NOT_ACTIVE("Product is currently not active", HttpStatus.BAD_REQUEST, 403),
    NOT_A_LEAF_CATEGORY("the provided category is not a leaf category", HttpStatus.BAD_REQUEST, 400),
    CANNOT_CANCEL_ORDER("Now you cannot Cancel this order", HttpStatus.NOT_ACCEPTABLE, 406),
    CANNOT_RETURN_ORDER("Cannot return order", HttpStatus.NOT_ACCEPTABLE, 406),
    IMAGE_PATTERN_NOT_MATCHES("Please add a valid image in jpg,jpeg,bmp,png format", HttpStatus.BAD_REQUEST, 400),
    NO_DATA_FOUND("No data found", HttpStatus.NOT_FOUND, 404),
    NO_PRODUCT_FOUND("Product not found for given data", HttpStatus.NOT_FOUND, 404),
    NO_CATEGORY_FOUND("Category not found for given data", HttpStatus.NOT_FOUND, 404),
    NO_FIELD_FOUND("Field not found for given data", HttpStatus.NOT_FOUND, 404),
    NO_VALUES_FOUND("Values not found for given data", HttpStatus.NOT_FOUND, 404),
    NO_VARIATION_FOUND("No Product variation found for given data", HttpStatus.NOT_FOUND, 404),
    IMAGE_NOT_FOUND("Image not found ", HttpStatus.NOT_FOUND, 404),
    CANNOT_UPDATE_STATUS("cannot change the status to this ", HttpStatus.NOT_ACCEPTABLE,406),
    STATUS_NOT_FOUND("Please provide a valid Order status", HttpStatus.NOT_FOUND, 404);

    String errorDesc;
    HttpStatus statusCode;
    int code;

    ErrorCode(String errorDesc, HttpStatus status, int code) {
        this.errorDesc = errorDesc;
        this.statusCode = status;
        this.code = code;
    }

    public int getCode() {
        return code;
    }

    public String getErrorDesc() {
        return errorDesc;
    }

    public HttpStatus getStatusCode() {
        return statusCode;
    }

}