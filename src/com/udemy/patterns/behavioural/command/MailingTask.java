package com.udemy.patterns.behavioural.command;

import java.util.LinkedList;
import java.util.List;
import java.util.Objects;

public class MailingTask implements Runnable {
    
    private Thread worker;
    
    private List<Command> pendingCommands;
    
    private static final MailingTask RUNNER = new MailingTask();
    
    public static MailingTask getInstance() {
        return RUNNER;
    }

    private MailingTask() {
        this.pendingCommands = new LinkedList<>();
        this.worker = new Thread(this);
        this.worker.start();
    }

    @Override
    public void run() {
        Command command = null;
        
        while (true) {
            if (pendingCommands.isEmpty()) {
                synchronized (pendingCommands) {
                    try {
                        pendingCommands.wait();
                    }
                    catch (InterruptedException e) {
                        System.out.println("Interrupted Exception: " + e);
                        e.printStackTrace();
                    }
                }
            } else {
                command = pendingCommands.remove(0);
            }
            
            if (Objects.nonNull(command)) {
                command.execute();
            }
        }
    }
    
    public void addCommand(Command command) {
        synchronized (pendingCommands) {
            pendingCommands.add(command);
            pendingCommands.notifyAll();
        }
    }
    
    public void stop() {
        this.worker.interrupt();
        System.out.println("Mailing task interrupted");
    }
}
