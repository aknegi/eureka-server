package com.bootcamp.coremodule.transformers;


import com.bootcamp.coremodule.dto.CustomerDTO;
import com.bootcamp.coremodule.dto.CustomerProfileDTO;
import com.bootcamp.coremodule.entities.Customer;
import com.bootcamp.coremodule.entities.Name;
import org.springframework.stereotype.Component;

@Component
public class CustomerTransformer implements EntityDTOTransformer<CustomerDTO, Customer> {
    @Override
    public Customer fromDTO(CustomerDTO baseDomain) {
        return null;
    }

    @Override
    public CustomerDTO toDTO(Customer baseDomainDTO) {
        return null;
    }


    public Customer mapCustomerFromDTO(CustomerProfileDTO customerProfileDTO, Customer customer) {
        Name name = customer.getName();
        if (customerProfileDTO.getFirstName() != null) {
            name.setFirstName(customerProfileDTO.getFirstName());
        }
        if (customerProfileDTO.getLastName() != null) {
            name.setLastName(customerProfileDTO.getLastName());
        }

        if (customerProfileDTO.getMiddleName() != null) {
            name.setMiddleName(customerProfileDTO.getMiddleName());
        }
        customer.setName(name);

        if (customerProfileDTO.getContact() != null) {
            customer.setContact(customerProfileDTO.getContact());
        }

        if (customerProfileDTO.getImage() != null) {
            customer.setImage(customerProfileDTO.getImage());
        }
        return customer;
    }
}