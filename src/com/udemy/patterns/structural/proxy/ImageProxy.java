package com.udemy.patterns.structural.proxy;

import javafx.geometry.Point2D;

import java.util.Objects;

public class ImageProxy implements Image {

    private String name;
    private Point2D location;
    private Image image;

    public ImageProxy(String name) {
        this.name = name;
    }

    @Override
    public void setLocation(Point2D location) {
        if (Objects.nonNull(image)) {
            image.setLocation(location);
        } else {
            this.location = location;
        }

    }

    @Override
    public Point2D getLocation() {
        return Objects.nonNull(image) ? image.getLocation() : this.location;
    }

    @Override
    public void render() {
        if (Objects.isNull(image)) {
            image = new BitmapImage(name);

            if (Objects.nonNull(location)) {
                image.setLocation(location);
            }
        }
        image.render();
    }
}
