package com.udemy.patterns.creational.singleton;

import java.util.Objects;

// Double check locking
public class RegistryLazyDCL {

    private static volatile RegistryLazyDCL INSTANCE;

    private RegistryLazyDCL() {

    }

    public static RegistryLazyDCL getInstance() {
        if (Objects.isNull(INSTANCE)) {
            synchronized (RegistryLazyDCL.class) {
                if (Objects.isNull(INSTANCE)) {
                    INSTANCE = new RegistryLazyDCL();
                }
            }
        }
        return INSTANCE;
    }
}
