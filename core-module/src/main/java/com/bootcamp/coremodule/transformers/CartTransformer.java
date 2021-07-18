package com.bootcamp.coremodule.transformers;

import com.bootcamp.coremodule.dto.CartResponseDTO;

import com.bootcamp.coremodule.entities.Cart;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CartTransformer {
    @Autowired
    ProductVariationTransformer productVariationTransformer;

    public CartResponseDTO toDTO(Cart cart) {
        CartResponseDTO cartResponseDTO = new CartResponseDTO();
        if (!cart.getProductVariation().getProduct().getActive() || cart.getProductVariation().getProduct().getDeleted()) {
            return null;
        }
        cartResponseDTO.setQuantity(cart.getQuantity());
        cartResponseDTO.setBrand(cart.getProductVariation().getProduct().getBrand());
        cartResponseDTO.setDescription(cart.getProductVariation().getProduct().getDescription());
        cartResponseDTO.setProductName(cart.getProductVariation().getProduct().getProductName());
        cartResponseDTO.setVariation(productVariationTransformer.toDTO(cart.getProductVariation()));
        cartResponseDTO.setOutOfStock(cartResponseDTO.getVariation().getQuantityAvailable() <= 0);
        return cartResponseDTO;
    }
}
