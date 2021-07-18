package com.bootcamp.coremodule.entities;


import com.bootcamp.coremodule.enums.Label;

import javax.persistence.Embeddable;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

@Embeddable
public class InvoiceAddress {
    private String customerCity;
    private String customerState;
    private String customerCountry;
    private String customerAddressLine;
    private String customerZipCode;
    @Enumerated(EnumType.STRING)
    private Label customerLabel;


    public String getCustomerCity() {
        return customerCity;
    }

    public void setCustomerCity(String customerCity) {
        this.customerCity = customerCity;
    }

    public String getCustomerState() {
        return customerState;
    }

    public void setCustomerState(String customerState) {
        this.customerState = customerState;
    }

    public String getCustomerCountry() {
        return customerCountry;
    }

    public void setCustomerCountry(String customerCountry) {
        this.customerCountry = customerCountry;
    }

    public String getCustomerAddressLine() {
        return customerAddressLine;
    }

    public void setCustomerAddressLine(String customerAddressLine) {
        this.customerAddressLine = customerAddressLine;
    }

    public String getCustomerZipCode() {
        return customerZipCode;
    }

    public void setCustomerZipCode(String customerZipCode) {
        this.customerZipCode = customerZipCode;
    }

    public Label getCustomerLabel() {
        return customerLabel;
    }

    public void setCustomerLabel(Label customerLabel) {
        this.customerLabel = customerLabel;
    }
}
