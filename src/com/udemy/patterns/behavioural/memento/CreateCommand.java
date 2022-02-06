package com.udemy.patterns.behavioural.memento;

public class CreateCommand extends AbstractWorkflowCommand {

    private String name;

    public CreateCommand(WorkflowDesigner designer, String name) {
        super(designer);
        this.name = name;
    }

    @Override
    public void execute() {
        this.memento = this.designer.getMemento();
        this.designer.createWorkflow(name);
    }
}
