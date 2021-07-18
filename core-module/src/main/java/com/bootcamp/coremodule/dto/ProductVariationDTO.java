package com.bootcamp.coremodule.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.json.simple.JSONArray;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import java.util.List;


public class ProductVariationDTO extends BaseDomainDTO {
    @NotNull(message = "Please provide product id ")
    private Long productId;
    @Min(value = 0, message = "quantity must be 0 or more")
    @NotNull(message = "please provide the quantity")
    private Integer quantityAvailable;
    @Min(value = 0, message = "price must be 0 or more")
    @NotNull(message = "please provide the price")
    private Double price;

    private String primaryImageName;

    @NotNull(message = "metadata is mandatory")
    private JSONArray metadata;

    @JsonIgnore
    private List<CartDTO> cartList;

    @JsonIgnore
    private List<OrderProductDTO> orderProduct;


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

    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public JSONArray getMetadata() {
        return metadata;
    }

    public void setMetadata(JSONArray metadata) {
        this.metadata = metadata;
    }

    public List<CartDTO> getCartList() {
        return cartList;
    }

    public void setCartList(List<CartDTO> cartList) {
        this.cartList = cartList;
    }

    public List<OrderProductDTO> getOrderProduct() {
        return orderProduct;
    }

    public void setOrderProduct(List<OrderProductDTO> orderProduct) {
        this.orderProduct = orderProduct;
    }

}
