package com.udemy.patterns.creational.objectpool;

import javafx.geometry.Point2D;

public interface Image {

    public void draw();

    public Point2D getLocation();

    public void setLocation(Point2D location);
}
