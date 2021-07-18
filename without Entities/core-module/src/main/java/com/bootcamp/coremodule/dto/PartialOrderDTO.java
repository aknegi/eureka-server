package com.bootcamp.coremodule.dto;

import java.util.ArrayList;
import java.util.List;

public class PartialOrderDTO {
    private List<Long> variationIdList =new ArrayList<>();
    private String paymentMethod;

    public List<Long> getVariationIdList() {
        return variationIdList;
    }

    public void setVariationIdList(List<Long> variationIdList) {
        this.variationIdList = variationIdList;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }
}
