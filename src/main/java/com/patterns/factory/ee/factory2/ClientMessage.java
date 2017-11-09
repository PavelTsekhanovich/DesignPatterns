package com.patterns.factory.ee.factory2;

import javax.inject.Inject;

public class ClientMessage {

    @Inject
    @ShortMessage
    private MessageA messageA;

    @Inject
    @LongMessage
    private MessageB messageB;

    public void doEvant(){
        messageA.setMessage("This is a long email message.");
        messageB.setMessage("This is a short SMS message.");

        System.out.println(messageA.getMessage());
        System.out.println(messageB.getMessage());
    }

}
