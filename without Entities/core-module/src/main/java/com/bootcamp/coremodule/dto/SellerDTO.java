package com.bootcamp.coremodule.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.util.HashSet;
import java.util.Set;


public class SellerDTO {

    private long id;
    private String firstName;
    private String middleName;
    private String lastName;
    @JsonIgnore
    private String gst;
    private String email;
    private String companyContact;
    private String companyName;
    private AddressDTO address;
    private Boolean active;
    @JsonIgnore
    private Set<ProductDTO> productSet;
    @JsonIgnore
    private String image;

    public SellerDTO() {
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public SellerDTO(long id) {
        this.setId(id);
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Set<ProductDTO> getProductSet() {
        return productSet;
    }

    public void setProductSet(ProductDTO product) {
        if (product != null) {
            if (productSet == null) {
                productSet = new HashSet<>();
            }
            product.setSeller(this);
            productSet.add(product);
        }
    }

    public AddressDTO getAddress() {
        return address;
    }

    public void setAddress(AddressDTO address) {
        this.address = address;
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
