package com.lynda.structural.design.patterns.bridge.ch02;

import com.lynda.structural.design.patterns.bridge.ch02.awt.MockGraphics;

public class Circle implements Shape {

    private ShapeColor color;

    public Circle(ShapeColor color) {
        this.color = color;
    }
    
    @Override
    public void draw(MockGraphics graphics) {
        color.setColor(graphics);
        graphics.drawOval(10, 10, 200, 200);
    }
}
