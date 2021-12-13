package com.lynda.structural.design.patterns.bridge.ch02;

import com.lynda.structural.design.patterns.bridge.ch02.awt.MockGraphics;

public class Square implements Shape {
    
    private ShapeColor color;

    public Square(ShapeColor color) {
        this.color = color;
    }

    @Override
    public void draw(MockGraphics graphics) {
        color.setColor(graphics);
        graphics.drawRect(10, 10, 200, 200);
    }
}
