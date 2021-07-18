package com.bootcamp.coremodule.dto;



import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class SellerProductAddDTO{
    @NotNull(message = "provide category id to which product is associated")
    private long category;

    @NotNull(message = "please provide product name")
    @Size(min=2, max = 30, message = "The length of product name should be between 1 to 30")
    private String productName;

    @NotNull(message = "please provide brand name of product")
    @Size(min=1, max = 15, message = "The length of brand name should be between 1 to 30")
    private String brand;

    @Size(min=1, max = 30, message = "The length of product Description should be between 5 to 40")
    private String description;

    private boolean cancellable;

    private boolean returnable;

    public Long getCategory() {
        return category;
    }

    public void setCategory(Long category) {
        this.category = category;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
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

    public boolean getCancellable() {
        return cancellable;
    }

    public void setCancellable(boolean cancellable) {
        this.cancellable = cancellable;
    }

    public boolean getReturnable() {
        return returnable;
    }

    public void setReturnable(boolean returnable) {
        this.returnable = returnable;
    }
}
