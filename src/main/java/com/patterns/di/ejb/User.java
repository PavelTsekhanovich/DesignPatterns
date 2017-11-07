package com.patterns.di.ejb;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

@Named
@RequestScoped
public class User {

    private String fullName;

    public String getFullName() {
        return this.fullName;
    }
}
