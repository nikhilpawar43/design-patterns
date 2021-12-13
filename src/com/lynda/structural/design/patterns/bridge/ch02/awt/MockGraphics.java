package com.lynda.structural.design.patterns.bridge.ch02.awt;

import java.awt.*;

public class MockGraphics {
    
    private Color color;

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public void drawRect(int x, int y, int width, int height) {
        System.out.println("Drawing a square object");
    }

    public void drawOval(int x, int y, int width, int height) {
        System.out.println("Drawing a circle object");
    }

    public void drawPolygon(int xPoints[], int yPoints[], int nPoints) {
        System.out.println("Drawing a triangle object");
    }
}
