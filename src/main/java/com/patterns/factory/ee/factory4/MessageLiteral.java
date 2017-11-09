package com.patterns.factory.ee.factory4;

import javax.enterprise.util.AnnotationLiteral;

import com.patterns.factory.ee.factory3.Message;

public class MessageLiteral extends AnnotationLiteral<Message> implements Message {

	private static final long serialVersionUID = 1L;
	private Message.Type type;

	public MessageLiteral(Type type) {
		this.type = type;
	}

	public Type value() {
		return type;
	}
}