package com.bootcamp.coremodule.repositories;

import com.bootcamp.coremodule.entities.Seller;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SellerRepository extends CrudRepository<Seller, Long> {
    Seller findByCompanyName(String name);

    @Query("FROM Seller")
    List<Seller> fetchAllSeller(Pageable pageable);

    Seller findByEmail(String email);

    @Query("from Seller where gst= :gst")
    Seller findByGST(@Param("gst")String gst);
}
