package com.udemy.patterns.structural.proxy;

import java.lang.reflect.Proxy;

public class ImageFactory {

    public static Image getImage(String name) {
        return new ImageProxy(name);
    }

    public static Object getImageWithDynamicProxy(String name) {
        return Proxy.newProxyInstance(ImageFactory.class.getClassLoader(), new Class[] { Image.class }, new ImageInvocationHandler(name));
    }
 }
