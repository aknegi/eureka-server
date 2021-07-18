package com.bootcamp.coremodule.entities;


import com.bootcamp.coremodule.enums.PaymentMethod;

import javax.persistence.*;
import java.util.List;

@Entity
public class Invoice extends BaseDomain {

    @ManyToOne
    @JoinColumn(name = "customerUserId")
    private Customer customer;
    private Double amountPaid;
    @Enumerated(EnumType.STRING)
    private PaymentMethod paymentMethod;

    @Embedded
    InvoiceAddress customerAddress;

    @OneToMany(mappedBy ="invoice",cascade = CascadeType.ALL)
    private List<OrderProduct> orderProductList;

    public Invoice() {
    }

    public Invoice(int id) {
        this.setId(id);
    }

    public List<OrderProduct> getOrderProductList() {
        return orderProductList;
    }

    public void setOrderProductList(List<OrderProduct> orderProductList) {
        this.orderProductList = orderProductList;
    }

    public InvoiceAddress getCustomerAddress() {
        return customerAddress;
    }

    public void setCustomerAddress(InvoiceAddress customerAddress) {
        this.customerAddress = customerAddress;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Double getAmountPaid() {
        return amountPaid;
    }

    public void setAmountPaid(Double amountPaid) {
        this.amountPaid = amountPaid;
    }

    public PaymentMethod getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(PaymentMethod paymentMethod) {
        this.paymentMethod = paymentMethod;
    }
}
