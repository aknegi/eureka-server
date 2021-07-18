package com.bootcamp.coremodule.repositories;

import com.bootcamp.coremodule.entities.ActivationToken;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ActivationTokenRepository extends CrudRepository<ActivationToken, Long> {

    ActivationToken findByActivationToken(String token);

    ActivationToken findByUserEmail(String token);

}
