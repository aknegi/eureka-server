package com.bootcamp.coremodule.entities;


import com.bootcamp.coremodule.entities.compositeKeys.ReviewCompositeKey;
import com.bootcamp.coremodule.enums.ProductRating;

import javax.persistence.*;

@Entity
public class ProductReview {

    @EmbeddedId
    private ReviewCompositeKey id=new ReviewCompositeKey();

    @ManyToOne
    @MapsId("productId")
    @JoinColumn(name = "productId")
    private Product product;

    @ManyToOne
    @MapsId("customerId")
    @JoinColumn(name = "customerId")
    private Customer customer;

    private String review;
    private ProductRating rating;




    public ReviewCompositeKey getId() {
        return id;
    }

    public void setId(ReviewCompositeKey id) {
        this.id = id;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public String getReview() {
        return review;
    }

    public void setReview(String review) {
        this.review = review;
    }

    public ProductRating getRating() {
        return rating;
    }

    public void setRating(ProductRating rating) {
        this.rating = rating;
    }
}
