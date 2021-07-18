package com.bootcamp.coremodule.dto;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;

public class EmailDTO {
    @NotEmpty(message = "email is required and should be unique")
    @Email(message = "enter a valid email")
    String email;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
