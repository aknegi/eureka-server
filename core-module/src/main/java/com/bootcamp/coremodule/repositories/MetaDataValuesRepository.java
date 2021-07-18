package com.bootcamp.coremodule.repositories;

import com.bootcamp.coremodule.entities.CategoryMetaDataFieldValues;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface MetaDataValuesRepository extends CrudRepository<CategoryMetaDataFieldValues, Integer> {

    @Query(value = "select * from category_meta_data_field_values where category_id= :id", nativeQuery = true)
    List<CategoryMetaDataFieldValues> findByCategory(@Param("id") long id);

    @Query(value = " select * from category_meta_data_field_values value where value.category_id=:categoryId and value.meta_data_id=:metadataFieldId", nativeQuery = true)
    CategoryMetaDataFieldValues fetchByCategoryAndMetadataField(@Param("categoryId") long categoryId, @Param("metadataFieldId") long metadataFieldId);

    @Query("select fieldValues from CategoryMetaDataFieldValues where category.id= :categoryId and categoryMetaField.id= :fieldId ")
    Optional<String> fetchMetaDataValues(long categoryId, long fieldId);


}
