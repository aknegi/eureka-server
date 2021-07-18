package com.bootcamp.coremodule.dto;


import com.bootcamp.coremodule.enums.OrderStatusEnum;

public class OrderStatusDTO extends BaseDomainDTO {

    private OrderProductDTO orderProduct;
    private OrderStatusEnum fromStatus;
    private OrderStatusEnum toStatus;
    private String transitionComment;

    public OrderProductDTO getOrderProduct() {
        return orderProduct;
    }

    public void setOrderProduct(OrderProductDTO orderProduct) {
        this.orderProduct = orderProduct;
    }


    public OrderStatusEnum getFromStatus() {
        return fromStatus;
    }

    public void setFromStatus(OrderStatusEnum fromStatus) {
        this.fromStatus = fromStatus;
    }

    public OrderStatusEnum getToStatus() {
        return toStatus;
    }

    public void setToStatus(OrderStatusEnum toStatus) {
        this.toStatus = toStatus;
    }

    public String getTransitionComment() {
        return transitionComment;
    }

    public void setTransitionComment(String transitionComment) {
        this.transitionComment = transitionComment;
    }
}
