package com.bootcamp.coremodule.customValidation;


import com.bootcamp.coremodule.exception.ECommerceException;
import com.bootcamp.coremodule.exception.ErrorCode;
import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

@Component
public class ImageValidation {
    public void imageFormatValidation(MultipartFile imageFile) {
        if (imageFile == null) {
            throw new ECommerceException(ErrorCode.INVALID_FIELDS);
        }
        Pattern p = Pattern.compile("([^\\s]+(\\.(?i)(jpg|png|jpeg|bmp))$)");
        Matcher m = p.matcher(imageFile.getOriginalFilename());
        if (!m.matches()) {
            throw new ECommerceException(ErrorCode.IMAGE_PATTERN_NOT_MATCHES);
        }
    }
}
