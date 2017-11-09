package com.patterns.decorator.ee;

import javax.decorator.Decorator;
import javax.decorator.Delegate;
import javax.enterprise.inject.Any;
import javax.inject.Inject;

@Decorator
public class BlackFridayDiscountDecorator extends AbstractDiscountDecorator {

	@Any
	@Inject
	@Delegate
	private Product product;

	public String generateLabel() {
		product.setPrice(product.getPrice() * 0.25);
		product.setLabel(product.getLabel());
		return product.generateLabel();
	}
}