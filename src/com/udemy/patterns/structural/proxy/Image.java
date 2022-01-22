package com.udemy.patterns.structural.proxy;

import javafx.geometry.Point2D;

public interface Image {

    void setLocation(Point2D location);

    Point2D getLocation();

    void render();
}
