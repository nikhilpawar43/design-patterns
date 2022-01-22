package com.udemy.patterns.structural.proxy;

import javafx.geometry.Point2D;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.Objects;

public class ImageInvocationHandler implements InvocationHandler {

    private String name;
    private Image bitmapImage;
    private Point2D location;

    public ImageInvocationHandler(String name) {
        this.name = name;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        switch (method.getName()) {
            case "setLocation":
                setLocationHandler(args);
                break;

            case "getLocation":
                return getLocationHandler();

            case "render":
                renderHandler();
                break;
        }

        return null;
    }

    public void setLocationHandler(Object[] args) {
        Point2D location = (Point2D) args[0];
        System.out.println("Location from ImageInvocationHandler: " + location);

        if (Objects.nonNull(bitmapImage)) {
            bitmapImage.setLocation(location);
        } else {
            this.location = location;
        }
    }

    public Point2D getLocationHandler() {
        if (Objects.nonNull(bitmapImage)) {
            return bitmapImage.getLocation();
        }
        return this.location;
    }

    public void renderHandler() {
        if (Objects.isNull(bitmapImage)) {
            bitmapImage = new BitmapImage(name);

            if (Objects.nonNull(location)) {
                bitmapImage.setLocation(location);
            }
        }

        bitmapImage.render();
    }
}
