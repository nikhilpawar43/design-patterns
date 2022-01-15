package com.udemy.patterns.creational.objectpool;

import javafx.geometry.Point2D;

public class Bitmap implements Image, Poolable {

    private String name;
    private Point2D location;

    public Bitmap(String name) {
        this.name = name;
    }

    @Override
    public void draw() {
        System.out.println("Draw Bitmap " + name + " @ " + location);
    }

    @Override
    public Point2D getLocation() {
        return location;
    }

    @Override
    public void setLocation(Point2D location) {
        this.location = location;
    }

    @Override
    public void reset() {
        System.out.println("Resetting the bitmap resource");
        this.location = null;
    }
}
