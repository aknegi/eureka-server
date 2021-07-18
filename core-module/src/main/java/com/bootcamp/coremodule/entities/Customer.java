package com.bootcamp.coremodule.entities;

import org.springframework.stereotype.Component;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.PrimaryKeyJoinColumn;
import java.util.ArrayList;
import java.util.List;

@Entity
@Component
@PrimaryKeyJoinColumn(name = "id")
public class Customer extends User {

    private String contact;
    @OneToMany(mappedBy = "customer",cascade = CascadeType.ALL)
    private List<Invoice> invoices;

    @OneToMany(mappedBy = "customer",cascade = CascadeType.ALL)
    private List<Cart> cartList;

    @OneToMany(mappedBy = "customer",cascade = CascadeType.ALL)
    private List<ProductReview> productReview;

    public List<Cart> getCartList() {
        return cartList;
    }

    public void setCartList(List<Cart> cartList) {
        this.cartList = cartList;
    }
    public void addToCartList(Cart cart){
        if(cart!=null){
            if(cartList==null){
                cartList=new ArrayList<>();
            }
            cart.setCustomer(this);
            cartList.add(cart);
        }
    }

    public Customer(){

    }

    public Customer(int id){
        this.setId(id);
    }
    public List<ProductReview> getProductReview() {
        return productReview;
    }

    public void setProductReview(List<ProductReview> productReview) {
        this.productReview = productReview;
    }

    public List<Invoice> getInvoices() {
        return invoices;
    }

    public void setInvoices(List<Invoice> invoices) {
        this.invoices = invoices;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }
}
