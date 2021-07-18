package com.bootcamp.coremodule.dto;

import com.fasterxml.jackson.annotation.JsonFilter;
import com.fasterxml.jackson.annotation.JsonInclude;

import java.util.List;

@JsonFilter(value = "responseDTOFilter")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class SellerProductVariationViewDTO extends BaseDomainDTO{

    private long id;
    private Integer quantityAvailable;
    private Double price;
    private String primaryImageName;
    private Boolean active;
    private List<Object> metadata;
    private SellerProductResponseDTO parentProduct;


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

    public List<Object> getMetadata() {
        return metadata;
    }

    public void setMetadata(List<Object> metadata) {
        this.metadata = metadata;
    }

    public SellerProductResponseDTO getParentProduct() {
        return parentProduct;
    }

    public void setParentProduct(SellerProductResponseDTO parentProduct) {
        this.parentProduct = parentProduct;
    }

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

    @Override
    public long getId() {
        return id;
    }

    @Override
    public void setId(long id) {
        this.id = id;
    }
}

