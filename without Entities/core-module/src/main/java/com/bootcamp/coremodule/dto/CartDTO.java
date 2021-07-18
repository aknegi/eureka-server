package com.bootcamp.coremodule.dto;


import javax.validation.constraints.NotNull;


public class CartDTO {

    @NotNull
    long productVariationId;

    @NotNull
    int quantity;

    public long getProductVariationId() {
        return productVariationId;
    }

    public void setProductVariationId(long productVariationId) {
        this.productVariationId = productVariationId;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
