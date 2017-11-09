package com.patterns.factory.ee.factory1;

import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.inject.Inject;

@Stateless
@TransactionAttribute(TransactionAttributeType.REQUIRED)
public class EvantService {

    @Inject
    public String message;

    @Inject
    private MessageA messageA;

    @Inject
    private MessageB messageB;

    public void startService(){
        messageA.setMessage("This is message");
        messageB.setMessage("This is message");

        System.out.println("Start service call " + messageA.getMessage());
        System.out.println("Start service call " + messageB.getMessage());
    }
}