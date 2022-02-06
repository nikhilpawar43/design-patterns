package com.udemy.patterns.behavioural.memento;

public class RemoveStepWorkflowCommand extends AbstractWorkflowCommand {

    private String step;

    public RemoveStepWorkflowCommand(WorkflowDesigner designer, String step) {
        super(designer);
        this.step = step;
    }

    @Override
    public void execute() {
        this.memento = this.designer.getMemento();
        this.designer.removeStep(step);
    }
}
