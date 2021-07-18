package com.bootcamp.coremodule.transformers;


import com.bootcamp.coremodule.dto.SellerProfileDTO;
import com.bootcamp.coremodule.entities.Name;
import com.bootcamp.coremodule.entities.Seller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SellerTransformer implements EntityDTOTransformer<SellerProfileDTO, Seller> {

    @Autowired
    AddressTransformer addressTransformer;

    @Override
    public Seller fromDTO(SellerProfileDTO baseDomain) {
        return null;
    }

    @Override
    public SellerProfileDTO toDTO(Seller seller) {
        SellerProfileDTO sellerProfileDTO = new SellerProfileDTO();
        sellerProfileDTO.setId(seller.getId());
        sellerProfileDTO.setCompanyName(seller.getCompanyName());
        sellerProfileDTO.setActive(seller.getActive());
        sellerProfileDTO.setFirstName(seller.getName().getFirstName());
        sellerProfileDTO.setMiddleName(seller.getName().getMiddleName());
        sellerProfileDTO.setLastName(seller.getName().getLastName());
        sellerProfileDTO.setCompanyContact(seller.getCompanyContact());
        sellerProfileDTO.setGst(seller.getGst());
        sellerProfileDTO.setImage(seller.getImage());
        sellerProfileDTO.setAddress(addressTransformer.toDTO(seller.getAddress()));
        return sellerProfileDTO;
    }

    public Seller mapSellerFromDTO(SellerProfileDTO sellerProfileDTO, Seller seller) {
        Name name = seller.getName();
        if (sellerProfileDTO.getFirstName() != null) {
            name.setFirstName(sellerProfileDTO.getFirstName());
        }
        if (sellerProfileDTO.getLastName() != null) {
            name.setLastName(sellerProfileDTO.getLastName());
        }
        if (sellerProfileDTO.getMiddleName() != null) {
            name.setMiddleName(sellerProfileDTO.getMiddleName());
        }
        seller.setName(name);
        if (sellerProfileDTO.getCompanyContact() != null) {
            seller.setCompanyContact(sellerProfileDTO.getCompanyContact());
        }
        if (sellerProfileDTO.getCompanyName() != null) {

            seller.setCompanyName(sellerProfileDTO.getCompanyName());
        }
        if (sellerProfileDTO.getGst() != null) {
            seller.setGst(sellerProfileDTO.getGst());
        }
        if (sellerProfileDTO.getImage() != null) {
            seller.setImage(sellerProfileDTO.getImage());
        }
        return seller;
    }

}
