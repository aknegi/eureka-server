package com.bootcamp.coremodule.repositories;

import com.bootcamp.coremodule.entities.LoggedInToken;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LoggedInTokenRepository extends CrudRepository<LoggedInToken,Long> {

    LoggedInToken findByUsername(String userName);
}
