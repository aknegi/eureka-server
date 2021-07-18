package com.bootcamp.coremodule.customValidation;


import com.bootcamp.coremodule.enums.PaymentMethod;
import com.bootcamp.coremodule.exception.ECommerceException;
import com.bootcamp.coremodule.exception.ErrorCode;
import org.springframework.stereotype.Component;

import java.util.stream.Stream;

@Component
public class PaymentMethodValidation {
    public PaymentMethod paymentMethodValidation(String paymentMethod) {
        return Stream.of(PaymentMethod.values())
                .filter(c -> c.toString().equals(paymentMethod))
                .findFirst()
                .orElseThrow(() -> {
                    throw new ECommerceException(ErrorCode.METHOD_NOT_FOUND);
                });
    }
}
