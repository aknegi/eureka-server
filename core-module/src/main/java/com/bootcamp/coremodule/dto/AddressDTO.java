package com.bootcamp.coremodule.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Validated
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AddressDTO extends BaseDomainDTO {

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

    @NotNull
    @Size(min = 6, max = 6, message = "zipCode length should be 6")
    private String zipCode;
    @NotNull(message = "Enter OFFICE or HOME as label")
    @Size(min = 2, message = "Enter OFFICE or HOME as label")
    private String label;

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }


    public String getCity() {
        return city;
    }


    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
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
}