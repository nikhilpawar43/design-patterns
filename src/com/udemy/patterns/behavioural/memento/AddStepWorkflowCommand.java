package com.udemy.patterns.behavioural.memento;

public class AddStepWorkflowCommand extends AbstractWorkflowCommand {

    private String step;

    public AddStepWorkflowCommand(WorkflowDesigner designer, String step) {
        super(designer);
        this.step = step;
    }

    @Override
    public void execute() {
        this.memento = this.designer.getMemento();
        this.designer.addStep(step);
    }
}
