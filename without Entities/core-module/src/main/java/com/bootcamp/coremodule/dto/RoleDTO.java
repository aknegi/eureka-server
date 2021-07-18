package com.bootcamp.coremodule.dto;


import com.bootcamp.coremodule.enums.RoleType;

import java.util.Set;
import java.util.stream.Stream;


public class RoleDTO extends BaseDomainDTO {

    private RoleType authority;
    private Set<UserDTO> userSet;

    public RoleDTO() {
    }

    public RoleDTO(String authority) {
        this.setAuthority(Stream.of(RoleType.values())
                .filter(c -> c.getUserRole().equals(authority))
                .findFirst()
                .orElseThrow(IllegalArgumentException::new));
    }


    public RoleType getAuthority() {
        return authority;
    }

    public void setAuthority(RoleType authority) {
        this.authority = authority;
    }


    public Set<UserDTO> getUserSet() {
        return userSet;
    }

    public void setUserSet(Set<UserDTO> userSet) {
        this.userSet = userSet;
    }

}
