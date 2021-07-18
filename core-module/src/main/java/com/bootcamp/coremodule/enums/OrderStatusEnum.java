package com.bootcamp.coremodule.enums;

import java.util.Arrays;
import java.util.List;

public enum OrderStatusEnum {
    ORDER_PLACED(Arrays.asList()),
    CANCELLED(Arrays.asList(AllOrderStatus.ORDER_PLACED, AllOrderStatus.ORDER_CONFIRMED, AllOrderStatus.REQUEST_PROCESSING)),
    ORDER_REJECTED(Arrays.asList(AllOrderStatus.REQUEST_PROCESSING, AllOrderStatus.REQUEST_PROCESSING)),
    ORDER_CONFIRMED(Arrays.asList(AllOrderStatus.REQUEST_PROCESSING, AllOrderStatus.REQUEST_PROCESSING)),
    ORDER_SHIPPED(Arrays.asList(AllOrderStatus.ORDER_CONFIRMED)),
    DELIVERED(Arrays.asList(AllOrderStatus.ORDER_SHIPPED)),
    RETURN_REQUESTED(Arrays.asList(AllOrderStatus.DELIVERED)),
    RETURN_REJECTED(Arrays.asList(AllOrderStatus.RETURN_REQUESTED)),
    RETURN_APPROVED(Arrays.asList(AllOrderStatus.RETURN_REQUESTED)),
    PICK_UP_INITIATED(Arrays.asList(AllOrderStatus.RETURN_APPROVED)),
    PICK_UP_COMPLETED(Arrays.asList(AllOrderStatus.PICKUP_INITIATED)),
    REFUND_INITIATED(Arrays.asList(AllOrderStatus.RETURN_APPROVED)),
    REFUND_COMPLETED(Arrays.asList(AllOrderStatus.REFUND_INITIATED)),
    CLOSED(Arrays.asList(AllOrderStatus.CANCELLED, AllOrderStatus.ORDER_REJECTED, AllOrderStatus.DELIVERED, AllOrderStatus.RETURN_REJECTED, AllOrderStatus.REFUND_COMPLETED)),
    REQUEST_PROCESSING(Arrays.asList(AllOrderStatus.ORDER_PLACED));

    private List<AllOrderStatus> allOrderStatuses;

    OrderStatusEnum(List<AllOrderStatus> allOrderStatuses) {
        this.allOrderStatuses = allOrderStatuses;
    }

    public List<AllOrderStatus> getFromStatus() {
        return allOrderStatuses;
    }

    public void setFromStatus(List<AllOrderStatus> allOrderStatuses) {
        this.allOrderStatuses = allOrderStatuses;
    }
}
