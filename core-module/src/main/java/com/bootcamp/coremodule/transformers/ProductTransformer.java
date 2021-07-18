package com.bootcamp.coremodule.transformers;


import com.bootcamp.coremodule.dto.ProductResponseDTO;
import com.bootcamp.coremodule.dto.SellerProductResponseDTO;
import com.bootcamp.coremodule.dto.SellerProductUpdateDTO;
import com.bootcamp.coremodule.entities.Product;
import com.bootcamp.coremodule.exception.ECommerceException;
import com.bootcamp.coremodule.exception.ErrorCode;
import com.bootcamp.coremodule.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.text.DateFormat;

@Component
public class ProductTransformer implements EntityDTOTransformer<ProductResponseDTO, Product> {
    @Autowired
    ProductRepository productRepository;
    @Autowired
    DateFormat dateFormat;
    @Override
    public Product fromDTO(ProductResponseDTO baseDomain) {
        return null;
    }

    @Override
    public ProductResponseDTO toDTO(Product product) {
        ProductResponseDTO responseProduct = new ProductResponseDTO();
        responseProduct.setId(product.getId());
        responseProduct.setCreatedDate(dateFormat.format(product.getCreatedDate()));
        responseProduct.setCreatedBy(product.getCreatedBy());
        responseProduct.setLastModifiedBy(product.getModifiedBy());
        responseProduct.setBrand(product.getBrand());
        responseProduct.setProductName(product.getProductName());
        responseProduct.setActive(product.getActive());
        responseProduct.setReturnable(product.getReturnable());
        responseProduct.setCancellable(product.getCancellable());
        responseProduct.setDescription(product.getDescription());
        responseProduct.setSellerName(product.getSeller().getName().getFirstName());
        responseProduct.setSellerContact(product.getSeller().getCompanyContact());
        return responseProduct;
    }


    public SellerProductResponseDTO mapProductForSeller(Product product) {
        SellerProductResponseDTO responseProduct = new SellerProductResponseDTO();
        responseProduct.setProductId(product.getId());
        responseProduct.setBrand(product.getBrand());
        responseProduct.setProductName(product.getProductName());
        responseProduct.setActive(product.getActive());
        responseProduct.setReturnable(product.getReturnable());
        responseProduct.setCancellable(product.getCancellable());
        responseProduct.setDescription(product.getDescription());
        responseProduct.setCategoryName(product.getCategory().getName());
        responseProduct.setCategoryId(product.getCategory().getId());
        return responseProduct;
    }

    public Product updateSellerProductFromDTO(Product product, SellerProductUpdateDTO sellerProductUpdateDTO, long sellerId) {
        if (sellerProductUpdateDTO.getName() != null) {
            if (productRepository.findByProductName(product.getBrand(), product.getCategory().getId(), sellerId, sellerProductUpdateDTO.getName()) != null) {
                throw new ECommerceException(ErrorCode.PRODUCT_ALREADY_EXISTS);
            }
            product.setProductName(sellerProductUpdateDTO.getName());
        }
        if (sellerProductUpdateDTO.getCancellable() != null) {
            product.setCancellable(sellerProductUpdateDTO.getCancellable());
        }
        if (sellerProductUpdateDTO.getReturnable() != null) {
            product.setReturnable(sellerProductUpdateDTO.getReturnable());
        }
        if (sellerProductUpdateDTO.getDescription() != null) {
            product.setDescription(sellerProductUpdateDTO.getDescription());
        }
        return product;
    }

}
