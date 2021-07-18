package com.bootcamp.coremodule.repositories;

import com.bootcamp.coremodule.entities.Category;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface CategoryRepository extends CrudRepository<Category, Long> {
    Category findByName(String name);

    @Query(value = "select * from category where parent_id= :parentId", nativeQuery = true)
    Optional<List<Category>> findNextChildren(@Param("parentId") Long id);

    @Query(value = "select * from category", nativeQuery = true)
    List<Category> fetchAllCategories(Pageable pageable);

    @Query(value = "select * from category where id NOT IN(select parent_id from category)", nativeQuery = true)
    List<Category> fetchLeafCategories();

    @Query(value = "from Category cat where cat.parentId=0")
    List<Category> fetchAllRootCategories(Pageable sortById);


    @Query(value = "select id from category where id NOT IN (select parent_id from category where parent_id IS NOT NULL)",nativeQuery = true)
    List<Long> fetchLeafCategoryId();

    @Query("select name from Category")
    List<String> fetchAllCategoriesNames();

}
