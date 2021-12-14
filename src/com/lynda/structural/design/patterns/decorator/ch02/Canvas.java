package com.lynda.structural.design.patterns.decorator.ch02;

import java.awt.*;

import javax.swing.*;

public class Canvas extends JPanel {

    private Component circle1 = new Circle(15, 30);
    private Component circle2 = new Circle(75, 30);
    private Component circle3 = new Circle(135, 30);

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(400, 400);
        frame.add(new Canvas());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    @Override
    public void paint(Graphics graphics) {
        circle1.draw(graphics);
        circle2 = new ComponentWithRedColor(circle2);
        circle2.draw(graphics);
        circle3.draw(graphics);
    }
}
