package com.patterns.observer.ee;

import javax.ejb.Stateless;
import javax.enterprise.event.Observes;

@Stateless
public class TraceObserver {
	public void serviceTrace(@Observes String message) {
		System.out.println("Service message: " + message);
	}
}