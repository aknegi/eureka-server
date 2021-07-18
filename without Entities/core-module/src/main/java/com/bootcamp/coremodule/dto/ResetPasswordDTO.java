package com.bootcamp.coremodule.dto;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;

public class ResetPasswordDTO {
    @Pattern(regexp = "((?=.*\\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%]).{8,15})", message = "Password must be 8 characters long and should contain uppercase,lowercase,digit,and special character")
    @NotEmpty(message = "email is required and should be unique")
    @Email(message = "enter a valid email")
    private String password;
    @NotEmpty(message = "email is required and should be unique")
    @Email(message = "enter a valid email")
    private String confirmPassword;

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getConfirmPassword() {
        return confirmPassword;
    }

    public void setConfirmPassword(String confirmPassword) {
        this.confirmPassword = confirmPassword;
    }
}
