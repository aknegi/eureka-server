package com.bootcamp.coremodule.entities;


import com.bootcamp.coremodule.entities.compositeKeys.CartCompositeKey;

import javax.persistence.*;

@Entity
public class Cart {
    @EmbeddedId
    CartCompositeKey cartCompositeKey=new CartCompositeKey();

    @ManyToOne
    @MapsId("customerId")
    @JoinColumn(name = "customerId")
    Customer customer;

    @ManyToOne
    @MapsId("variationId")
    @JoinColumn(name = "prodVariationId")
    ProductVariation productVariation;

    Integer quantity;

    public CartCompositeKey getCartCompositeKey() {
        return cartCompositeKey;
    }

    public void setCartCompositeKey(CartCompositeKey cartCompositeKey) {
        this.cartCompositeKey = cartCompositeKey;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public ProductVariation getProductVariation() {
        return productVariation;
    }

    public void setProductVariation(ProductVariation productVariation) {
        this.productVariation = productVariation;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }
}
