package com.udemy.patterns.creational.singleton;

public class RegistryEager {

    private static final RegistryEager INSTANCE = new RegistryEager();

    private RegistryEager() {

    }

    public static RegistryEager getInstance() {
        return INSTANCE;
    }
}
