package com.bootcamp.coremodule.enums;

public enum MailContent {
    CUSTOMER_REGISTERED("Congratulations you are successfully registered, please active your account here is you authentication token" +
            " which will be valid for 15 minutes only = \n  http://localhost:8080/register/activate/", "Registration Done!!", "Congratulations you are successfully registered"),
    SELLER_REGISTERED("Congratulations you are successfully registered with an inactivated account, please wait for the" +
            "account activation before login", "Registration Done!!", "Congratulations you are successfully registered"),
    ACTIVATION_LINK("Please active your account with the given link, here is you authentication token" +
            " which will be valid for 15 minutes only = \n  http://localhost:8080/register/activate/", " Activation token", "Activation link is sent to your main, please activate your account with the activation token"),
    NEW_ACTIVATION_LINK("Your token is Expired, Please active your account with new token here is you authentication token" +
            " which will be valid for 15 minutes only = \n  http://localhost:8080/register/activate/", "new Activation token", "please activate your account with new activation token"),
    USER_ACTIVATED("Account is successfully activated", "Account update", "Account is successfully activated"),
    USER_DEACTIVATED("Your account is Deactivated now!!", "Account Update", "Account is deactivated successfully"),
    ACCOUNT_LOCKED("your account is locked for 24 hours", "account is locked", ""),
    FORGOT_PASSWORD_LINK("Please reset your password with the given link. It will expire in 15 minutes \n" +
            "reset link:- http://localhost:8080/register/reset-token/", "Password Reset Link!!", "Please check your email, and reset your password"),
    PASSWORD_UPDATED("Your password is successfully updated", "Password is updated", "Password is successfully updated"),
    PRODUCT_ADDED("A new product has been added Please take some action.\n Seller ID: ", "New product is added", "Your product is successfully added, wait for the activation."),
    PRODUCT_ACTIVATED("Your product is now Active.\n Product Name: ", "Product activated", "The product is activated successfully"),
    PRODUCT_DEACTIVATED("Your product is now Deactivated.\n Product Name: ", "Product deactivated", "The product is activated successfully");

    private String body;
    private String topic;
    private String response;

    MailContent(String body, String topic, String response) {
        this.body = body;
        this.topic = topic;
        this.response = response;
    }

    public String getResponse() {
        return response;
    }

    public void setResponse(String response) {
        this.response = response;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }
}
