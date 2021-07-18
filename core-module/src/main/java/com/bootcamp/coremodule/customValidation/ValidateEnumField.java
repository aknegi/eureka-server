package com.bootcamp.coremodule.customValidation;

import com.bootcamp.coremodule.enums.Label;
import com.bootcamp.coremodule.exception.ECommerceException;
import com.bootcamp.coremodule.exception.ErrorCode;
import org.springframework.stereotype.Component;

import java.util.stream.Stream;

@Component
public class ValidateEnumField {

    public Label labelValidation(String label) {
        return Stream.of(Label.values())
                .filter(c -> c.toString().equals(label))
                .findFirst()
                .orElseThrow(() -> {
                    throw new ECommerceException(ErrorCode.LABEL_NOT_FOUND);
                });
    }
}
