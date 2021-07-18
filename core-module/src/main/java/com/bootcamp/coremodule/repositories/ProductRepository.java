package com.bootcamp.coremodule.repositories;

import com.bootcamp.coremodule.entities.Product;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository extends CrudRepository<Product, Long> {

    @Query(value = "select * from product p where p.brand= :brand and category_id =:categoryId and seller_user_id= :sellerId and product_name= :productName", nativeQuery = true)
    Product findByProductName(@Param("brand") String brand, @Param("categoryId") long categoryId, @Param("sellerId") Long id,@Param("productName")String productName);

    @Query("from Product p where p.seller.id=:sellerId")
    List<Product> fetchAllSellerProduct(@Param("sellerId") long id, Pageable pageable);

    @Query("from Product where active = true")
    List<Product> fetchAllProducts(Pageable pageable);

    @Query("from Product where category.id= :id")
    List<Product> fetchAllCategoryProducts(long id);

    @Query("from Product p where p.category.id=:categoryId and p.active=true")
    List<Product> fetchSimilarProducts(@Param("categoryId") Long categoryId,Pageable sortById);

    @Query(value = "select distinct brand From product where category_id =:categoryId and deleted=false",nativeQuery = true)
    List<String> fetchBrandList(@Param("categoryId") Long categoryId);

    @Query(value = "select * from product where deleted = true",nativeQuery = true)
    List<Product> getDeletedProducts();

    @Modifying
    @Query(value="delete from product where id= :id",nativeQuery = true)
    void deleteProduct(@Param("id") long id);
}
