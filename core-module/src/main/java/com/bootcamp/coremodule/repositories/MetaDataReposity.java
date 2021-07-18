package com.bootcamp.coremodule.repositories;

import com.bootcamp.coremodule.entities.CategoryMetaField;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface MetaDataReposity extends CrudRepository<CategoryMetaField, Long> {

    CategoryMetaField findByName(String name);

    @Query(" from  CategoryMetaField ")
    Optional<List<CategoryMetaField>> fetchAll(Pageable pageable);
}
