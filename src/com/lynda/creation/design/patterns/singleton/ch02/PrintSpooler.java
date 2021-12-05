package com.lynda.creation.design.patterns.singleton.ch02;

public class PrintSpooler {

    private static PrintSpooler spooler;

    private static boolean initialized = false ;

    private PrintSpooler() {

    }

    public static PrintSpooler getInstance() {

        if (initialized) {
            return spooler;
        }

        spooler = new PrintSpooler();
        initialized = true;

        return spooler;
    }
}
