package com.bootcamp.coremodule.repositories;

import com.bootcamp.coremodule.entities.User;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<User,Long> {
    User findByEmailAndActive(String name,boolean active);
    User findByEmail(String name);

    @Modifying
    @Query("UPDATE Customer SET active = true where email= :email")
    void activateUser(@Param("email")String email);

    @Modifying
    @Query("UPDATE Customer SET active = false where email= :email")
    void deactivateUser(String email);

    @Modifying
    @Query("UPDATE User u SET u.failedAttempt = ?1 WHERE u.email = ?2")
    public void updateFailedAttempts(int failAttempts, String email);

    @Modifying
    @Query("UPDATE User u SET u.accountNonLocked = :status WHERE u.email = :email")
    void updateAccountNonLocked(@Param("status")boolean b,@Param("email") String email);
}

