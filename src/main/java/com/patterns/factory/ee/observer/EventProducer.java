package com.patterns.factory.ee.observer;

import javax.enterprise.inject.Produces;
import javax.inject.Named;

public class EventProducer {

	@Produces
	@Named("Logging")
	public String messageAFactory() {
		return "A message";
	}

	@Produces
	@Named("Message")
	public String messageBFactory() {
		return "Another message";
	}
}