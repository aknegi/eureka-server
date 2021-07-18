package com.bootcamp.coremodule.customValidation;


import com.bootcamp.coremodule.enums.AllOrderStatus;
import com.bootcamp.coremodule.enums.OrderStatusEnum;
import com.bootcamp.coremodule.exception.ECommerceException;
import com.bootcamp.coremodule.exception.ErrorCode;
import org.springframework.stereotype.Component;

import java.util.stream.Stream;

@Component
public class OrderStatusValidation {
    public OrderStatusEnum orderStatusValidation(String status) {
        return Stream.of(OrderStatusEnum.values())
                .filter(c -> c.toString().equals(status))
                .findFirst()
                .orElseThrow(() -> {
                    throw new ECommerceException(ErrorCode.STATUS_NOT_FOUND);
                });
    }

    public AllOrderStatus getStatusAsEnum(String status){
        return Stream.of(AllOrderStatus.values())
                .filter(c -> c.toString().equals(status))
                .findFirst()
                .orElseThrow(() -> {
                    throw new ECommerceException(ErrorCode.STATUS_NOT_FOUND);
                });
    }
}
