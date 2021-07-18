package com.bootcamp.coremodule.repositories;


import com.bootcamp.coremodule.entities.Invoice;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface InvoiceRepository extends CrudRepository<Invoice,Long> {
    @Query(value = "select * from invoice where customer_user_id= :customerId",nativeQuery = true)
    List<Invoice> fetchAllOrders(@Param("customerId") long customerId, Pageable sortById);


}