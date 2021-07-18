package com.bootcamp.coremodule.repositories;

import com.bootcamp.coremodule.entities.ProductVariation;
import org.springframework.data.domain.Pageable;
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
public interface ProductVariationRepository extends CrudRepository<ProductVariation, Long> {

    @Query(" FROM ProductVariation WHERE product.id= :id")
    List<ProductVariation> findByProductId(long id, Pageable pageable);

    @Query(value = "select MIN(price) from product_variation where product_id IN (select id from product where category_id=:category_id and deleted=false)", nativeQuery = true)
    Double getMinPrice(@Param("category_id") Long categoryId);

    @Query(value = "select MAX(price) from product_variation where product_id IN (select id from product where category_id=:category_id and deleted=false)", nativeQuery = true)
    Double getMaxPrice(@Param("category_id") Long categoryId);

    @Modifying
    @Query(value = "delete from product_variation where product_id= :id", nativeQuery = true)
    void deleteByProductId(@Param("id") long id);

    @Query(" FROM ProductVariation WHERE product.id= :id")
    List<ProductVariation> findByCustomerId(long id, Pageable pageable);

    @Lock(LockModeType.PESSIMISTIC_WRITE)
    @QueryHints({@QueryHint(name = "javax.persistence.lock.timeout", value = "3000")})
    Optional<ProductVariation> findById(long id);

/*    @Modifying
    @Query("UPDATE ProductVariation set deleted = true where productId= :id")
    void deleteByProduct(@Param("id") long id);*/
}
