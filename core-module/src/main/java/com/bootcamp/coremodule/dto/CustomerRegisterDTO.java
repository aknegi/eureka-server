package com.bootcamp.coremodule.dto;


import javax.validation.constraints.*;

public class CustomerRegisterDTO {

    @NotEmpty(message = " first name is required ")
    @Size(min = 2, max = 30, message = "firstName length should be between 5 to 30 chars")
    private String firstName;

    @NotNull(message = " last name is required ")
    @Size(min = 2, max = 30, message = "lastName length should be between 5 to 30 chars")
    private String lastName;

    @Size(min = 2, max = 30, message = "middleName length should be between 5 to 30 chars")
    private String middleName;

    @NotEmpty(message = "email is required and should be unique")
    @Email(message = "enter a valid email")
    @Size(min = 5, max = 30, message = "email length should be between 5 to 30 chars")
    private String email;

    @NotEmpty(message = "password is mandatory ")
    @Pattern(regexp = "((?=.*\\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%]).{8,15})", message = "Password must be 8 characters long and should contain uppercase,lowercase,digit,and special character")
    private String password;

    @NotEmpty(message = "password is mandatory ")
    @Pattern(regexp = "((?=.*\\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%]).{8,15})", message = "Password must be 8 characters long and should contain uppercase,lowercase,digit,and special character")
    private String confirmPassword;


    @Pattern(regexp = "((\\+*)((0[ -]+)*|(91 )*)(\\d{12}+|\\d{10}+))", message = "enter a valid phone number")
    @NotNull(message = "contact number required")
    private String contact;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

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
