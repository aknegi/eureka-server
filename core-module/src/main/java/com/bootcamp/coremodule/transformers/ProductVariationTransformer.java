package com.bootcamp.coremodule.transformers;


import com.bootcamp.coremodule.dto.ProductVariationDTO;
import com.bootcamp.coremodule.dto.ProductVariationUpdateDTO;
import com.bootcamp.coremodule.dto.SellerProductVariationViewDTO;
import com.bootcamp.coremodule.entities.Product;
import com.bootcamp.coremodule.entities.ProductVariation;
import org.json.simple.JSONObject;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ProductVariationTransformer implements EntityDTOTransformer<SellerProductVariationViewDTO, ProductVariation> {
    @Override
    public ProductVariation fromDTO(SellerProductVariationViewDTO baseDomain) {
        return null;
    }

    @Override
    public SellerProductVariationViewDTO toDTO(ProductVariation productVariation) {
        SellerProductVariationViewDTO variation = new SellerProductVariationViewDTO();
        variation.setId(productVariation.getId());
        variation.setPrice(productVariation.getPrice());
        variation.setPrimaryImageName(productVariation.getPrimaryImageName());
        variation.setQuantityAvailable(productVariation.getQuantityAvailable());
        variation.setMetadata((List<Object>) productVariation.getMetadata().get("metadata"));
        variation.setActive(productVariation.getActive());
        return variation;
    }

    public ProductVariation mapProductVariationFromDTO(ProductVariationDTO productVariationDTO, Product product) {
        ProductVariation productVariation = new ProductVariation();
        productVariation.setProduct(product);
        productVariation.setPrice(productVariationDTO.getPrice());
        JSONObject metadata = new JSONObject();
        metadata.put("metadata", productVariationDTO.getMetadata());
        productVariation.setMetadata(metadata);
        productVariation.setActive(true);
        productVariation.setPrimaryImageName(productVariationDTO.getPrimaryImageName());
        productVariation.setQuantityAvailable(productVariationDTO.getQuantityAvailable());
        return productVariation;
    }

    public ProductVariation updateVariationFromDTO(ProductVariation productVariation, ProductVariationUpdateDTO variationUpdates) {

        if (variationUpdates.getPrice() != productVariation.getPrice() && variationUpdates.getPrice() != null) {
            productVariation.setPrice(variationUpdates.getPrice());
        }

        if (variationUpdates.getPrimaryImageName() != null) {
            productVariation.setPrimaryImageName(variationUpdates.getPrimaryImageName());
        }
        if (variationUpdates.getQuantityAvailable() != null) {
            productVariation.setQuantityAvailable(variationUpdates.getQuantityAvailable());
        }
        if (variationUpdates.getActive() != null) {
            productVariation.setActive(variationUpdates.getActive());
        }
        if (variationUpdates.getMetadata() != null) {
            JSONObject metadata = new JSONObject();
            metadata.put("metadata", variationUpdates.getMetadata());
            productVariation.setMetadata(metadata);
        }
        return productVariation;
    }
}
