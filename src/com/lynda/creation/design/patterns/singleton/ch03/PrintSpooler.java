package com.lynda.creation.design.patterns.singleton.ch03;

public class PrintSpooler {

    private static final PrintSpooler SPOOLER = new PrintSpooler();

    private static boolean initialized = false;

    private PrintSpooler() {

    }

    private void init() {
        // Some initialization code for print spooler
    }

    public static PrintSpooler getInstance() {
        if (initialized) {
            return SPOOLER;
        }
        SPOOLER.init();
        initialized = true;

        return SPOOLER;
    }
}
