package com.bootcamp.coremodule.repositories;

import com.bootcamp.coremodule.entities.Address;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AddressRepository extends CrudRepository<Address, Long> {

    @Query("from Address a where a.user.id=:userId")
    List<Address> fetchAddresses(@Param("userId") Long id);

    @Modifying
    @Query("UPDATE Address set deleted = true where id= :id")
    void deleteStatus(@Param("id") long id);

    @Query("from Address a where a.user.id=:userId")
    Address findAddress(@Param("userId") Long id);
}

