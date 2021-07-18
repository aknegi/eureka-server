package com.bootcamp.coremodule.entities;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@PrimaryKeyJoinColumn(name = "id")


public class Seller extends User {

    private String gst;
    private String companyContact;
    private String companyName;

    @OneToOne(cascade = CascadeType.ALL)
    private Address address;

    @OneToMany(mappedBy = "seller", fetch = FetchType.EAGER,cascade = CascadeType.ALL)
    private Set<Product> productSet;

    public Seller() {
    }

    public Seller(long id) {
        this.setId(id);
    }


    public Set<Product> getProductSet() {
        return productSet;
    }

    public void setProductSet(Set<Product> productSet) {
        this.productSet = productSet;
    }

    public void addProduct(Product product) {
        if (product != null) {
            if (productSet == null) {
                productSet = new HashSet<>();
            }
            product.setSeller(this);
            this.productSet.add(product);
        }
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        address.setUser(this);
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
