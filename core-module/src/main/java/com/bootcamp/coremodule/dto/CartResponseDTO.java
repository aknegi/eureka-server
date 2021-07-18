package com.bootcamp.coremodule.dto;

import com.fasterxml.jackson.annotation.JsonFilter;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonFilter(value = "responseDTOFilter")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CartResponseDTO {
    private Integer quantity;
    private String ProductName;
    private String brand;
    private String description;
    private SellerProductVariationViewDTO variation;
    private Boolean outOfStock=false;

    public Boolean getOutOfStock() {
        return outOfStock;
    }

    public void setOutOfStock(Boolean outOfStock) {
        this.outOfStock = outOfStock;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public String getProductName() {
        return ProductName;
    }

    public void setProductName(String productName) {
        ProductName = productName;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public SellerProductVariationViewDTO getVariation() {
        return variation;
    }

    public void setVariation(SellerProductVariationViewDTO variation) {
        this.variation = variation;
    }
}
