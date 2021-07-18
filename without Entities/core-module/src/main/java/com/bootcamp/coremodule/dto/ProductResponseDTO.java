package com.bootcamp.coremodule.dto;

import com.fasterxml.jackson.annotation.JsonFilter;
import com.fasterxml.jackson.annotation.JsonInclude;

import java.util.List;

@JsonFilter(value = "responseDTOFilter")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ProductResponseDTO extends BaseDomainDTO{

    private String productName;
    private String sellerName;
    private String sellerContact;
    private Boolean cancellable;
    private Boolean returnable;
    private String brand;
    private Boolean active;
    private String description;
    private CategoryDTO categoryDetails;
    private List<SellerProductVariationViewDTO> productVariations;

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getSellerName() {
        return sellerName;
    }

    public void setSellerName(String sellerName) {
        this.sellerName = sellerName;
    }

    public String getSellerContact() {
        return sellerContact;
    }

    public void setSellerContact(String sellerContact) {
        this.sellerContact = sellerContact;
    }

    public Boolean getCancellable() {
        return cancellable;
    }

    public void setCancellable(Boolean cancellable) {
        this.cancellable = cancellable;
    }

    public Boolean getReturnable() {
        return returnable;
    }

    public void setReturnable(Boolean returnable) {
        this.returnable = returnable;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public CategoryDTO getCategoryDetails() {
        return categoryDetails;
    }

    public void setCategoryDetails(CategoryDTO categoryDetails) {
        this.categoryDetails = categoryDetails;
    }

    public List<SellerProductVariationViewDTO> getProductVariations() {
        return productVariations;
    }

    public void setProductVariations(List<SellerProductVariationViewDTO> productVariations) {
        this.productVariations = productVariations;
    }
}
