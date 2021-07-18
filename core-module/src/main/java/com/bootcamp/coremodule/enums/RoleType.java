package com.bootcamp.coremodule.enums;

import com.fasterxml.jackson.annotation.JsonValue;

public enum RoleType {
    ROLE_ADMIN("ROLE_ADMIN"),
    ROLE_SELLER("ROLE_SELLER"),
    ROLE_CUSTOMER("ROLE_CUSTOMER");

        String userRole;
        RoleType(String userRole) {
            this.userRole=userRole;
        }
        @JsonValue
        public String getUserRole() {
            return userRole;
        }
    }