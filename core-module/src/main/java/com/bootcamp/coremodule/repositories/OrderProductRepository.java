package com.bootcamp.coremodule.repositories;

import com.bootcamp.coremodule.entities.OrderProduct;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OrderProductRepository extends CrudRepository<OrderProduct,Long> {
    List<OrderProduct> findByInvoiceId(long id);

    @Query("from OrderProduct ord where ord.productVariation.product.seller.id= :sellerId")
    List<OrderProduct> fetchAllSellerOrders(@Param("sellerId") long sellerId, Pageable sortById);

    @Query(value = " select * from order_product",nativeQuery = true)
    List<OrderProduct> fetchAllOrders(Pageable sortById);
}
