package com.bootcamp.coremodule.repositories;

import com.bootcamp.coremodule.entities.Role;
import com.bootcamp.coremodule.enums.RoleType;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepository extends CrudRepository<Role, Long> {
    Role findByAuthority(RoleType roleType);

}
