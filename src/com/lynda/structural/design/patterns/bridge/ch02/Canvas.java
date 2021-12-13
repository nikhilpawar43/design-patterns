package com.lynda.structural.design.patterns.bridge.ch02;

import com.lynda.structural.design.patterns.bridge.ch02.awt.MockGraphics;

public class Canvas {

    public static void main(String[] args) {

        MockGraphics graphics = new MockGraphics();
        
        // Draw red triangle
        Shape trianle = new Triangle(new RedShapeColor());
        trianle.draw(graphics);

        // Draw green circle
        Shape circle = new Circle(new GreenShapeColor());
        circle.draw(graphics);

        // Draw blue square
        Shape square = new Square(new BlueShapeColor());
        square.draw(graphics);
    }
}
