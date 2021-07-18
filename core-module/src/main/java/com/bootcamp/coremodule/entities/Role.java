package com.bootcamp.coremodule.entities;

import com.bootcamp.coremodule.enums.RoleType;
import org.springframework.stereotype.Component;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.ManyToMany;
import java.util.Set;
import java.util.stream.Stream;

@Component
@Entity
public class Role extends BaseDomain {


    @Enumerated(EnumType.STRING)
    private RoleType authority;


    @ManyToMany(mappedBy = "roleList")
    private Set<User> userSet;


    public Role() {
    }
    public Role(String authority) {
           this.setAuthority( Stream.of(RoleType.values())
                   .filter(c -> c.getUserRole().equals(authority))
                   .findFirst()
                   .orElseThrow(IllegalArgumentException::new));
    }
    public void addUser(User user){
        this.userSet.add(user);
    }

    public RoleType getAuthority() {
        return authority;
    }

    public void setAuthority(RoleType authority) {
        this.authority = authority;
    }


    public Set<User> getUserSet() {
        return userSet;
    }

    public void setUserSet(Set<User> userSet) {
        this.userSet = userSet;
    }

}
