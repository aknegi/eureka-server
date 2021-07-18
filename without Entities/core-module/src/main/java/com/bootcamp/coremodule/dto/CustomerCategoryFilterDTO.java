package com.bootcamp.coremodule.dto;

import com.fasterxml.jackson.annotation.JsonInclude;

import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CustomerCategoryFilterDTO {

    private Long categoryId;

    private String categoryName;

    private List<CategoryMetadataFieldResponse> categoryMetadataFieldValuesList;

    private List<String> brandNames;

    private Double maxPrice;

    private Double minPrice;

    public Long getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Long categoryId) {
        this.categoryId = categoryId;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public List<CategoryMetadataFieldResponse> getCategoryMetadataFieldValuesList() {
        return categoryMetadataFieldValuesList;
    }

    public void setCategoryMetadataFieldValuesList(List<CategoryMetadataFieldResponse> categoryMetadataFieldValuesList) {
        this.categoryMetadataFieldValuesList = categoryMetadataFieldValuesList;
    }

    public List<String> getBrandNames() {
        return brandNames;
    }

    public void setBrandNames(List<String> brandNames) {
        this.brandNames = brandNames;
    }

    public Double getMaxPrice() {
        return maxPrice;
    }

    public void setMaxPrice(Double maxPrice) {
        this.maxPrice = maxPrice;
    }

    public Double getMinPrice() {
        return minPrice;
    }

    public void setMinPrice(Double minPrice) {
        this.minPrice = minPrice;
    }
}
