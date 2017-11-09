package com.patterns.factory.ee.factory4;

import com.patterns.factory.ee.factory3.Message;
import com.patterns.factory.ee.factory3.MessageType;

import javax.ejb.TransactionAttribute;
import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.ejb.TransactionAttributeType;

@TransactionAttribute(TransactionAttributeType.REQUIRED)
@ApplicationScoped
public class Client {
	@Inject
	MessageFactory mf;

	public void doMessage() {
		MessageType m = mf.getMessage(Message.Type.SHORT);
		m.setMessage("This is a short message");
		System.out.println(m.getMessage());
		m = mf.getMessage(Message.Type.LONG);
		m.setMessage("This is a long message");
		System.out.println(m.getMessage());
	}
}
