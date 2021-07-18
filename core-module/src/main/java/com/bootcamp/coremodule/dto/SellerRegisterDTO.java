package com.bootcamp.coremodule.dto;

import javax.validation.constraints.*;

public class SellerRegisterDTO {

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
    @Size(min = 2, max = 30, message = "email length should be between 5 to 30 chars")
    private String email;

    @NotEmpty(message = "password is mandatory ")
    @Pattern(regexp = "((?=.*\\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%]).{8,15})", message = "Password must be 8 characters long and should contain uppercase,lowercase,digit,and special character")
    private String password;

    @NotEmpty(message = "password is mandatory ")
    @Pattern(regexp = "((?=.*\\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%]).{8,15})", message = "Confirm Password must be 8 characters long and should contain uppercase,lowercase,digit,and special character")
    private String confirmPassword;

    @Pattern(regexp = "((\\+*)((0[ -]+)*|(91 )*)(\\d{12}+|\\d{10}+))|\\d{5}([- ]*)\\d{6}", message = "enter a valid company contact number")
    @NotNull(message = "Company contact number required")
    private String companyContact;

    @Pattern(regexp = "^[0-9]{2}[A-Z]{5}[0-9]{4}"
            + "[A-Z]{1}[1-9A-Z]{1}"
            + "Z[0-9A-Z]{1}$", message = "give in proper GST format")
    private String gst;

    @NotEmpty(message = "Company Name is required and should be unique")
    @Size(min = 5, max = 30, message = "company name length should be between 5 to 30 chars")
    private String companyName;

    @NotNull(message = " City name is required ")
    @Size(min = 2, max = 20, message = "City name length should be between 2 to 20 chars")
    private String city;

    @NotNull(message = " State name is required ")
    @Size(min = 2, max = 20, message = "State name length should be between 2 to 20  chars")
    private String state;

    @NotNull(message = " Country name is required ")
    @Size(min = 2, max = 20, message = "country name length should be between 2 to 20 chars")
    private String country;

    @NotNull(message = " Address Line name is required ")
    @Size(min = 2, max = 20, message = "Address Line length should be between 2 to 20 chars")
    private String addressLine;

    @NotNull(message = "Zip Code is required")
    @Size(min = 6, max = 6, message = "zipCode length should be 6")
    private String zipCode;

    @NotNull(message = "Enter OFFICE or HOME as label")
    @Size(min = 2, message = "Enter OFFICE or HOME as label")
    private String label;

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getAddressLine() {
        return addressLine;
    }

    public void setAddressLine(String addressLine) {
        this.addressLine = addressLine;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
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

    public String getGst() {
        return gst;
    }

    public void setGst(String gst) {
        this.gst = gst;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getCompanyContact() {
        return companyContact;
    }

    public void setCompanyContact(String companyContact) {
        this.companyContact = companyContact;
    }
}
