package com.bootcamp.coremodule.repositories;

import com.bootcamp.coremodule.entities.Cart;
import org.springframework.data.jpa.repository.Lock;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.QueryHints;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import javax.persistence.LockModeType;
import javax.persistence.QueryHint;
import java.util.List;
import java.util.Optional;

@Repository
public interface CartRepository extends CrudRepository<Cart, Long> {
    @Query(value = "select * from cart where customer_id= :customerId",nativeQuery = true)
    List<Cart> fetchCustomerProducts(@Param("customerId") long customerId);

    @Query(value = "select * from cart where customer_id= :customerId and prod_variation_id= :variationId",nativeQuery = true)
    Cart fetchCartDetails(@Param("customerId") long customerId,@Param("variationId") long variationId);

    @Modifying
    @Query(value = "delete from cart where customer_id= :customerId",nativeQuery = true)
    void cleanCustomerCart(@Param("customerId") long customerId);

    @Lock(LockModeType.PESSIMISTIC_WRITE)
    @QueryHints({@QueryHint(name = "javax.persistence.lock.timeout", value = "3000")})
    @Query("from Cart where customer.id =:customerId")
    List<Cart> findByCustomerId(@Param("customerId") long id);

    @Lock(LockModeType.PESSIMISTIC_WRITE)
    @QueryHints({@QueryHint(name = "javax.persistence.lock.timeout", value = "3000")})
    Optional<Cart> productVariationId(long id);
}
