package com.bootcamp.coremodule.transformers;


import com.bootcamp.coremodule.dto.OrderProductDTO;
import com.bootcamp.coremodule.entities.Invoice;
import com.bootcamp.coremodule.entities.OrderProduct;
import com.bootcamp.coremodule.entities.ProductVariation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.text.DateFormat;

@Component
public class OrderProductTransformer {
    @Autowired
    ProductVariationTransformer productVariationTransformer;

    @Autowired
    DateFormat dateFormat;

    public OrderProductDTO toDto(OrderProduct orderProduct) {
        OrderProductDTO orderProductDTO = new OrderProductDTO();
        orderProductDTO.setCustomerId(orderProduct.getInvoice().getCustomer().getId());
        orderProductDTO.setSellerId(orderProduct.getProductVariation().getProduct().getSeller().getId());
        orderProductDTO.setId(orderProduct.getId());
        orderProductDTO.setCreatedDate(dateFormat.format(orderProduct.getCreatedDate()));
        orderProductDTO.setBrand(orderProduct.getProductVariation().getProduct().getBrand());
        orderProductDTO.setProductName(orderProduct.getProductVariation().getProduct().getProductName());
        orderProductDTO.setVariation(productVariationTransformer.toDTO(orderProduct.getProductVariation()));
        orderProductDTO.setQuantity(orderProduct.getQuantity());
        orderProductDTO.setPrice(orderProduct.getPrice());
        return orderProductDTO;
    }

    public OrderProduct mapOrderProduct(Invoice invoice, ProductVariation productVariation, int quantity) {
        OrderProduct orderProduct = new OrderProduct();
        orderProduct.setInvoice(invoice);
        orderProduct.setProductVariation(productVariation);
        orderProduct.setPrice(productVariation.getPrice() * quantity);
        orderProduct.setQuantity(quantity);
        return orderProduct;
    }
}
