package com.lynda.structural.design.patterns.bridge.ch02;

import com.lynda.structural.design.patterns.bridge.ch02.awt.MockGraphics;

import java.awt.*;

public class BlueShapeColor implements ShapeColor {
    
    @Override
    public void setColor(MockGraphics graphics) {
        System.out.println("Setting shape color as BLUE");
        graphics.setColor(Color.BLUE);
    }
}
