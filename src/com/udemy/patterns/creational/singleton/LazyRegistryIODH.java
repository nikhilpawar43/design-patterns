package com.udemy.patterns.creational.singleton;

public class LazyRegistryIODH {

    private LazyRegistryIODH() {

    }

    private static class LazyRegistryHolder {
        static LazyRegistryIODH INSTANCE = new LazyRegistryIODH();
    }

    public static LazyRegistryIODH getInstance() {
        return LazyRegistryHolder.INSTANCE;
    }

}
