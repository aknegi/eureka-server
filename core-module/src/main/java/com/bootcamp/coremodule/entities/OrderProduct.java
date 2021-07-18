package com.bootcamp.coremodule.entities;

import javax.persistence.*;


@Entity
public class OrderProduct  extends BaseDomain{


    private int quantity;
    private Double price;

    @ManyToOne
    @JoinColumn(name = "productVariationId")
    private ProductVariation productVariation;

    @ManyToOne
    @JoinColumn(name = "InvoiceId")
    private Invoice invoice;

    @OneToOne(mappedBy ="orderProduct", cascade= CascadeType.ALL)
    private OrderStatus orderStatus;

    public OrderProduct() {

    }
    public OrderProduct(int id) {
        this.setId(id);
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

    public ProductVariation getProductVariation() {
        return productVariation;
    }

    public void setProductVariation(ProductVariation productVariation) {
        this.productVariation = productVariation;
    }

    public Invoice getInvoice() {
        return invoice;
    }

    public void setInvoice(Invoice invoice) {
        this.invoice = invoice;
    }

    public OrderStatus getOrderStatus() {

        return orderStatus;
    }

    public void setOrderStatus(OrderStatus orderStatus) {
        this.orderStatus = orderStatus;
    }
}
