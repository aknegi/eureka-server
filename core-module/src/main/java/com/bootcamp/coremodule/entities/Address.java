package com.bootcamp.coremodule.entities;

import com.bootcamp.coremodule.enums.Label;
import org.hibernate.annotations.Where;
import org.springframework.stereotype.Component;

import javax.persistence.*;

@Component
@Entity


@Where(clause = "deleted = false")
public class Address extends BaseDomain {
    private String city;
    private String state;
    private String country;
    private String addressLine;
    private String zipCode;
    @Enumerated(EnumType.STRING)
    private Label label;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;


    public String getCity() {
        return city;
    }

    public Label getLabel() {
        return label;
    }

    public void setLabel(Label label) {
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

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}