package com.bootcamp.coremodule.transformers;


import com.bootcamp.coremodule.dto.OrderProductDTO;
import com.bootcamp.coremodule.dto.OrderResponseDTO;
import com.bootcamp.coremodule.entities.Invoice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.text.DateFormat;
import java.util.List;

@Component
public class InvoiceTransformer {
    @Autowired
    DateFormat dateFormat;

    @Autowired
    AddressTransformer addressTransformer;
    public OrderResponseDTO invoiceToDto(List<OrderProductDTO> orderProductDTOList, Invoice invoice) {
        OrderResponseDTO orderResponseDTO = new OrderResponseDTO();
        orderResponseDTO.setId(invoice.getId());
        orderResponseDTO.setOrderDate(dateFormat.format(invoice.getCreatedDate()));
        orderResponseDTO.setOrderProducts(orderProductDTOList);
        orderResponseDTO.setPaymentMethod(invoice.getPaymentMethod().toString());
        orderResponseDTO.setAddress(addressTransformer.mapInvoiceAddressToDTO(invoice.getCustomerAddress()));
        orderResponseDTO.setTotalAmountPaid(invoice.getAmountPaid());
        return orderResponseDTO;
    }
}