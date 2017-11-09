package com.patterns.decorator.ee;

import com.patterns.decorator.se.book.Extra;
import com.patterns.decorator.se.book.Order;

public class RegularExtra extends Extra {

	public RegularExtra(String label, double price, Order order) {
		super(label, price, order);
	}

	public double getPrice() {
		return this.price + order.getPrice();
	}
}