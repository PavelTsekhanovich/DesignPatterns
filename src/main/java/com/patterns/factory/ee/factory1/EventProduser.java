package com.patterns.factory.ee.factory1;

import javax.enterprise.inject.Produces;
import javax.inject.Named;

public class EventProduser {

    @Produces
    public String getMessage(){
        return "Hi!";
    }

    @Produces
    @Named("Logging")
    public MessageA messageAFactory(){
        return new MessageA();
    }

    @Produces
    @Named("Message")
    public MessageB messageBFactory(){
        return new MessageB();
    }
}
