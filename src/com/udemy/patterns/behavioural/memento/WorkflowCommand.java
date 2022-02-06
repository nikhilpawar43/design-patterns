package com.udemy.patterns.behavioural.memento;

public interface WorkflowCommand {

    void execute();

    void undo();
}
