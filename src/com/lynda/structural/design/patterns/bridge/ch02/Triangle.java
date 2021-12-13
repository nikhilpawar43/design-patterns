package com.lynda.structural.design.patterns.bridge.ch02;

import com.lynda.structural.design.patterns.bridge.ch02.awt.MockGraphics;

public class Triangle implements Shape {

    private ShapeColor color;

    public Triangle(ShapeColor color) {
        this.color = color;
    }
    
    @Override
    public void draw(MockGraphics graphics) {
        color.setColor(graphics);
        graphics.drawPolygon(new int[] {10, 20}, new int[] {30, 40}, 3);
    }
}
