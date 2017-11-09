package com.patterns.factory.ee.factory2;

import com.patterns.factory.ee.observer.MyEvent;

import javax.enterprise.inject.Produces;

public class EventProduser2 {

    @Produces
    @MyEvent(MyEvent.Type.LOGGING)
    public String messageAFactory() {
        return "A message";
    }

    @Produces
    @MyEvent(MyEvent.Type.MESSAGE)
    public String messageBFactory() {
        return "Another message";
    }
}
