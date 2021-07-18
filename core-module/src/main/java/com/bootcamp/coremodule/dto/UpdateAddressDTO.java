package com.bootcamp.coremodule.dto;

import javax.validation.constraints.Size;

public class UpdateAddressDTO {


    @Size(min = 2,max = 20, message = "City name length should be between 2 to 20 chars")
    private String city;

    @Size(min =  2,max = 20, message = "State name length should be between 2 to 20  chars")
    private String state;

    @Size(min = 2,max = 20, message = "country name length should be between 2 to 20 chars")
    private String country;

    @Size(min = 2,max = 20, message = "Address Line length should be between 2 to 20 chars")
    private String addressLine;

    @Size(min = 6, max = 6, message = "zipCode length should be 6")
    private String zipCode;

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
}
