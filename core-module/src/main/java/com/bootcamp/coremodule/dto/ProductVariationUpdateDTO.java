package com.bootcamp.coremodule.dto;

import org.json.simple.JSONArray;

import javax.validation.constraints.Min;
import javax.validation.constraints.Pattern;

public class ProductVariationUpdateDTO {

    @Min(value = 0, message = "quantity must be 0 or more")
    private Integer quantityAvailable;

    @Min(value = 0, message = "price must be 0 or more")
    private Double price;

    @Pattern(regexp = "([^\\s]+(\\.(?i)(jpg|png|jpeg|bmp))$)")
    private String primaryImageName;

    private JSONArray metadata;

    private Boolean active;

    public Integer getQuantityAvailable() {
        return quantityAvailable;
    }

    public void setQuantityAvailable(Integer quantityAvailable) {
        this.quantityAvailable = quantityAvailable;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getPrimaryImageName() {
        return primaryImageName;
    }

    public void setPrimaryImageName(String primaryImageName) {
        this.primaryImageName = primaryImageName;
    }

    public JSONArray getMetadata() {
        return metadata;
    }

    public void setMetadata(JSONArray metadata) {
        this.metadata = metadata;
    }

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }
}
