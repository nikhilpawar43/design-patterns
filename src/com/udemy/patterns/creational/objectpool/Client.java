package com.udemy.patterns.creational.objectpool;

import javafx.geometry.Point2D;

public class Client {

    private static final ObjectPool<Bitmap> bitmapImagePool = new ObjectPool<>(() -> new Bitmap("logo.bmp"), 3);

    public static void main(String[] args) {

        Bitmap bitmapResource1 = bitmapImagePool.get();
        Bitmap bitmapResource2 = bitmapImagePool.get();

        bitmapResource1.setLocation(new Point2D(10, 10));
        bitmapResource2.setLocation(new Point2D(-10, 20));

        bitmapResource1.draw();
        bitmapResource2.draw();

        bitmapImagePool.release(bitmapResource1);
        bitmapImagePool.release(bitmapResource2);
    }
}
