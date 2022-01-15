package com.udemy.patterns.creational.singleton;

public class Client {

    public static void main(String[] args) {

        RegistryEager eagerSingleton1 = RegistryEager.getInstance();
        RegistryEager eagerSingleton2 = RegistryEager.getInstance();

        System.out.println(eagerSingleton1 == eagerSingleton2);

        RegistryLazyDCL lazySingleton1 = RegistryLazyDCL.getInstance();
        RegistryLazyDCL lazySingleton2 = RegistryLazyDCL.getInstance();

        System.out.println(lazySingleton1 == lazySingleton2);

        LazyRegistryIODH lazyRegistrySingleton1 = LazyRegistryIODH.getInstance();
        LazyRegistryIODH lazyRegistrySingleton2 = LazyRegistryIODH.getInstance();

        System.out.println(lazyRegistrySingleton1 == lazyRegistrySingleton2);
    }
}
