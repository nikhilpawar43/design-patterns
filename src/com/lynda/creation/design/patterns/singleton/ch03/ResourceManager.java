package com.lynda.creation.design.patterns.singleton.ch03;

public class ResourceManager {

    public static void main(String[] args) {

        PrintSpooler spooler = PrintSpooler.getInstance();
        System.out.println(spooler);
    }
}
