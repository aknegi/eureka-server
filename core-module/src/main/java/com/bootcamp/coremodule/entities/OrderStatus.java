package com.bootcamp.coremodule.entities;


import com.bootcamp.coremodule.enums.OrderStatusEnum;

import javax.persistence.*;

@Entity
public class OrderStatus extends BaseDomain {

    @OneToOne
    @JoinColumn(name = "OrderProductId")
    private OrderProduct orderProduct;
    @Enumerated(EnumType.STRING)
    private OrderStatusEnum fromStatus;
    @Enumerated(EnumType.STRING)
    private OrderStatusEnum toStatus;
    private String transitionComment;

    public OrderProduct getOrderProduct() {
        return orderProduct;
    }

    public void setOrderProduct(OrderProduct orderProduct) {
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
