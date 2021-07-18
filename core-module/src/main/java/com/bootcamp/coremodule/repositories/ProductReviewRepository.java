package com.bootcamp.coremodule.repositories;

import com.bootcamp.coremodule.entities.ProductReview;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductReviewRepository extends CrudRepository<ProductReview,Integer> {
}
