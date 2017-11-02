package com.patterns.basicofjavaee;

import javax.inject.Inject;

public class Service {

    @Inject
    private Message message;

    public void showMessage(){
        System.out.println(message.getMessage());
    }
}
