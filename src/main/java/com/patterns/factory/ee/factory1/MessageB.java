package com.patterns.factory.ee.factory1;

import javax.enterprise.inject.Alternative;

@Alternative
public class MessageB {

    private String message;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
