package com.bootcamp.coremodule.dto;

import com.fasterxml.jackson.annotation.JsonFilter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonFilter(value = "responseDTOFilter")
public class OrderProductDTO extends BaseDomainDTO {
    private long id;
    private long customerId;
    private long sellerId;
    private String productName;
    private int quantity;
    private Double price;
    private String brand;
    private SellerProductVariationViewDTO variation;
    @JsonIgnore
    private InvoiceDTO invoice;
    @JsonIgnore
    private OrderStatusDTO orderStatus;

    public OrderProductDTO() {

    }

    public String getBrand() {
        return brand;
    }

    public long getCustomerId() {
        return customerId;
    }

    public void setCustomerId(long customerId) {
        this.customerId = customerId;
    }

    public long getSellerId() {
        return sellerId;
    }

    public void setSellerId(long sellerId) {
        this.sellerId = sellerId;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {

        this.quantity = quantity;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public SellerProductVariationViewDTO getVariation() {
        return variation;
    }

    public void setVariation(SellerProductVariationViewDTO variation) {
        this.variation = variation;
    }

    public InvoiceDTO getInvoice() {
        return invoice;
    }

    public void setInvoice(InvoiceDTO invoice) {
        this.invoice = invoice;
    }

    public OrderStatusDTO getOrderStatus() {

        return orderStatus;
    }

    public void setOrderStatus(OrderStatusDTO orderStatus) {
        this.orderStatus = orderStatus;
    }
}
