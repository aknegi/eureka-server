package com.bootcamp.coremodule.dto;


import com.bootcamp.coremodule.enums.PaymentMethod;

import java.util.List;

public class InvoiceDTO extends BaseDomainDTO {

    private CustomerDTO customer;
    private int amountPaid;
    private PaymentMethod paymentMethod;
    InvoiceAddressDTO customerAddress;

    private List<OrderProductDTO> orderProductList;

    public InvoiceDTO() {
    }

    public InvoiceDTO(int id) {
        this.setId(id);
    }

    public CustomerDTO getCustomer() {
        return customer;
    }

    public void setCustomer(CustomerDTO customer) {
        this.customer = customer;
    }

    public int getAmountPaid() {
        return amountPaid;
    }

    public void setAmountPaid(int amountPaid) {
        this.amountPaid = amountPaid;
    }

    public PaymentMethod getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(PaymentMethod paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public InvoiceAddressDTO getCustomerAddress() {
        return customerAddress;
    }

    public void setCustomerAddress(InvoiceAddressDTO customerAddress) {
        this.customerAddress = customerAddress;
    }

    public List<OrderProductDTO> getOrderProductList() {
        return orderProductList;
    }

    public void setOrderProductList(List<OrderProductDTO> orderProductList) {
        this.orderProductList = orderProductList;
    }
}
