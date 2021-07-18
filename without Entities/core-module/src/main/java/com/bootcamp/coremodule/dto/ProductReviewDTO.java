package com.bootcamp.coremodule.dto;


import com.bootcamp.coremodule.enums.ProductRating;

public class ProductReviewDTO {



    private ProductDTO product;

    private CustomerDTO customer;

    private String review;
    private ProductRating rating;



    public ProductDTO getProduct() {
        return product;
    }

    public void setProduct(ProductDTO product) {
        this.product = product;
    }

    public CustomerDTO getCustomer() {
        return customer;
    }

    public void setCustomer(CustomerDTO customer) {
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
