package com.bootcamp.coremodule.dto;

import java.util.List;


public class ProductDTO extends BaseDomainDTO {

    private String productName;
    private SellerDTO seller;
    private CategoryDTO category;
    private Boolean cancellable;
    private Boolean returnable;
    private String brand;
    private Boolean active;
    private String description;
    private List<ProductReviewDTO> productReview;
    private List<ProductVariationDTO> productVariations;

    public ProductDTO() {
    }

    public ProductDTO(long id) {
        this.setId(id);
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public SellerDTO getSeller() {
        return seller;
    }

    public void setSeller(SellerDTO seller) {
        this.seller = seller;
    }


    public CategoryDTO getCategory() {
        return category;
    }

    public void setCategory(CategoryDTO category) {
        this.category = category;
    }

    public List<ProductReviewDTO> getProductReview() {
        return productReview;
    }

    public void setProductReview(List<ProductReviewDTO> productReview) {
        this.productReview = productReview;
    }

    public List<ProductVariationDTO> getProductVariations() {
        return productVariations;
    }

    public void setProductVariations(List<ProductVariationDTO> productVariations) {
        this.productVariations = productVariations;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
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
}
