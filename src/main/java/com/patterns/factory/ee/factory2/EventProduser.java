package com.patterns.factory.ee.factory2;

import javax.enterprise.inject.Produces;

public class EventProduser {

    @Produces
    @ShortMessage
    private MessageA messageAFactory(){
        return new MessageA();
    }

    @Produces
    @LongMessage
    private MessageB messageBFactory(){
        return new MessageB();
    }
}
