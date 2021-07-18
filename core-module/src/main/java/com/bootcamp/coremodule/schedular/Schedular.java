package com.bootcamp.coremodule.schedular;

import com.bootcamp.coremodule.entities.Product;
import com.bootcamp.coremodule.repositories.ProductRepository;
import com.bootcamp.coremodule.repositories.ProductVariationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;

@Component
public class Schedular {

    @Autowired
    ProductRepository productRepository;

    @Autowired
    ProductVariationRepository productVariationRepository;

    @Transactional
    @Scheduled(cron = "@weekly")   //*/10 * * * * *
    public void scheduledDeleteFunction() {
        List<Product> productList = productRepository.getDeletedProducts();
        for (Product product : productList) {
            Date currentTime = new Date();
            long duration = currentTime.getTime() - product.getLastModifiedDate().getTime();
            long difference = TimeUnit.MILLISECONDS.toDays(duration);
            if (difference > 7) {
                productVariationRepository.deleteByProductId(product.getId());
                productRepository.deleteProduct(product.getId());
            }
        }
    }
}