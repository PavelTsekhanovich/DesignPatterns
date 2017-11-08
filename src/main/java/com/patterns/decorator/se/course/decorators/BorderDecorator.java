package com.patterns.decorator.se.course.decorators;

import com.patterns.decorator.se.course.objects.Component;

public class BorderDecorator extends Decorator {

    public BorderDecorator(Component component) {
        super(component);
    }

    @Override
    public void afterDraw() {
        System.out.println(" ... add border");
    }
}
