package com.bootcamp.coremodule.repositories;

import com.bootcamp.coremodule.entities.OrderStatus;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface OrderStatusRepository extends CrudRepository<OrderStatus,Long> {
    Optional<OrderStatus> findByOrderProductId(long id);
}
