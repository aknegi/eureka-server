package com.bootcamp.coremodule.entities;

import javax.persistence.Entity;

@Entity
public class ActivationToken extends BaseDomain {
    private String activationToken;
    private String userEmail;

    public String getActivationToken() {
        return activationToken;
    }

    public void setActivationToken(String activationToken) {
        this.activationToken = activationToken;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }
}
