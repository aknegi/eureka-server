package com.bootcamp.coremodule.repositories;

import com.bootcamp.coremodule.entities.Customer;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CustomerRepository extends CrudRepository<Customer, Long> {

    @Query("FROM Customer")
    List<Customer> fetchAllCustomer(Pageable pageable);

    Customer findByEmail(String email);
}
