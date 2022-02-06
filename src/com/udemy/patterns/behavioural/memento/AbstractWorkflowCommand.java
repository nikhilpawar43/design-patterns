package com.udemy.patterns.behavioural.memento;

public abstract class AbstractWorkflowCommand implements WorkflowCommand {

    protected WorkflowDesigner.Memento memento;

    protected WorkflowDesigner designer;

    public AbstractWorkflowCommand(WorkflowDesigner designer) {
        this.designer = designer;
    }

    @Override
    public void undo() {
        this.designer.setMemento(memento);
    }
}
