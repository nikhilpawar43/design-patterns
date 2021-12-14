package com.lynda.structural.design.patterns.decorator.ch02;

import java.awt.*;

public class ComponentWithRedColor implements Component {
    
    private Component decoratedComponent;

    public ComponentWithRedColor(Component component) {
        this.decoratedComponent = component;
    }

    @Override
    public void draw(Graphics graphics) {
        graphics.setColor(Color.RED);
        decoratedComponent.draw(graphics);
        
        graphics.setColor(Color.BLACK);
    }
}
