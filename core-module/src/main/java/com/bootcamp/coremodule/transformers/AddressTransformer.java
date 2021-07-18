package com.bootcamp.coremodule.transformers;


import com.bootcamp.coremodule.customValidation.ValidateEnumField;
import com.bootcamp.coremodule.dto.AddressDTO;
import com.bootcamp.coremodule.dto.InvoiceAddressDTO;
import com.bootcamp.coremodule.dto.SellerRegisterDTO;
import com.bootcamp.coremodule.dto.UpdateAddressDTO;
import com.bootcamp.coremodule.entities.Address;
import com.bootcamp.coremodule.entities.InvoiceAddress;
import com.bootcamp.coremodule.enums.Label;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class AddressTransformer implements EntityDTOTransformer<AddressDTO, Address> {

    @Autowired
    ValidateEnumField validateEnumField;

    @Override
    public Address fromDTO(AddressDTO addressDTO) {
        Address address = new Address();
        address.setAddressLine(addressDTO.getAddressLine());
        Label label = validateEnumField.labelValidation(addressDTO.getLabel());
        address.setLabel(label);
        address.setCity(addressDTO.getCity());
        address.setCountry(addressDTO.getCountry());
        address.setState(addressDTO.getState());
        address.setZipCode(addressDTO.getZipCode());
        return address;
    }

    @Override
    public AddressDTO toDTO(Address address) {
        AddressDTO addressDTO = new AddressDTO();
        addressDTO.setId(address.getId());
        addressDTO.setAddressLine(address.getAddressLine());
        addressDTO.setLabel(address.getLabel().toString());
        addressDTO.setCity(address.getCity());
        addressDTO.setCountry(address.getCountry());
        addressDTO.setState(address.getState());
        addressDTO.setZipCode(address.getZipCode());
        return addressDTO;
    }


    public Address mapSellerAddress(SellerRegisterDTO sellerDTO) {
        Address address = new Address();
        address.setAddressLine(sellerDTO.getAddressLine());
        address.setCity(sellerDTO.getCity());
        address.setState(sellerDTO.getState());
        address.setCountry(sellerDTO.getCountry());
        address.setZipCode(sellerDTO.getZipCode());
        Label label = validateEnumField.labelValidation(sellerDTO.getLabel());
        address.setLabel(label);
        return address;
    }

    public void mapAddressToUpdate(Address address, UpdateAddressDTO addressDTO) {
        if (addressDTO.getAddressLine() != null) {
            address.setAddressLine(addressDTO.getAddressLine());
        }
        if (addressDTO.getCity() != null) {
            address.setCity(addressDTO.getCity());
        }
        if (addressDTO.getState() != null) {
            address.setState(addressDTO.getState());
        }
        if (addressDTO.getCountry() != null) {
            address.setCountry(addressDTO.getCountry());
        }
        if (addressDTO.getLabel() != null) {
            Label label = validateEnumField.labelValidation(addressDTO.getLabel());
            address.setLabel(label);
        }
        if (addressDTO.getZipCode() != null) {
            address.setZipCode(addressDTO.getZipCode());
        }
    }
    public InvoiceAddress mapToInvoiceAddress(Address address) {
        InvoiceAddress invoiceAddress = new InvoiceAddress();
        invoiceAddress.setCustomerAddressLine(address.getAddressLine());
        invoiceAddress.setCustomerCity(address.getCity());
        invoiceAddress.setCustomerState(address.getState());
        invoiceAddress.setCustomerLabel(address.getLabel());
        invoiceAddress.setCustomerZipCode(address.getZipCode());
        invoiceAddress.setCustomerCountry(address.getCountry());
        return invoiceAddress;
    }

    public InvoiceAddressDTO mapInvoiceAddressToDTO(InvoiceAddress invoiceAddress) {
        InvoiceAddressDTO invoiceAddressDTO = new InvoiceAddressDTO();
        invoiceAddressDTO.setAddressLine(invoiceAddress.getCustomerAddressLine());
        invoiceAddressDTO.setCity(invoiceAddress.getCustomerCity());
        invoiceAddressDTO.setState(invoiceAddress.getCustomerState());
        invoiceAddressDTO.setCountry(invoiceAddress.getCustomerCountry());
        invoiceAddressDTO.setLabel(invoiceAddress.getCustomerLabel().toString());
        invoiceAddressDTO.setZipCode(invoiceAddress.getCustomerZipCode());
        return invoiceAddressDTO;
    }

}
