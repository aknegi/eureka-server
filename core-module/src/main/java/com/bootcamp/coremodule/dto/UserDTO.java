package com.bootcamp.coremodule.dto;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class UserDTO extends BaseDomainDTO {


    private String firstName;
    private String middleName;
    private String lastName;
    private String email;
    private String password;
    private Boolean deleted = false;
    private Boolean active = false;
    private String image;

    private Set<AddressDTO> addressSet;
    private List<RoleDTO> roleList;


    public Set<AddressDTO> getAddressSet() {
        return addressSet;
    }

    public void setAddressSet(Set<AddressDTO> inputAddressSet) {
        if (inputAddressSet != null) {
            if (addressSet == null) {
                addressSet = new HashSet<>();
            }
            for (AddressDTO address : inputAddressSet) {
                addressSet.add(address);
            }
        }
    }


    public List<RoleDTO> getRoleList() {
        return roleList;
    }

    public void setRoleList(List<RoleDTO> roles) {
        if (roles != null) {
            if (roleList == null) {
                roleList = new ArrayList<>();
            }
            for (RoleDTO role : roles) {
                roleList.add(role);
            }
        }
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Boolean getDeleted() {
        return deleted;
    }

    public void setDeleted(Boolean deleted) {
        this.deleted = deleted;
    }

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }
}
