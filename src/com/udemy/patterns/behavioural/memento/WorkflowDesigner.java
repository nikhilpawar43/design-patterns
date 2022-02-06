package com.udemy.patterns.behavioural.memento;

import java.util.List;
import java.util.Objects;

public class WorkflowDesigner {

    private Workflow workflow;

    public void createWorkflow(String name) {
        this.workflow = new Workflow(name);
    }

    public Workflow getWorkflow() {
        return workflow;
    }

    public Memento getMemento() {
        if (Objects.isNull(workflow)) {
            return new Memento();
        }
        return new Memento(this.workflow.getName(), this.workflow.getSteps());
    }

    public void setMemento(Memento memento) {
        if (Objects.isNull(memento.getName()) || Objects.isNull(memento.getSteps())) {
            this.workflow = null;
        }
        this.workflow = new Workflow(memento.getName(), memento.getSteps());
    }

    public void addStep(String step) {
        this.workflow.addStep(step);
    }

    public void removeStep(String step) {
        this.workflow.removeStep(step);
    }

    public void print() {
        System.out.println(this.workflow);
    }

    public class Memento {

        private String name;
        private String[] steps;

        private Memento() {

        }

        private Memento(String name, String[] steps) {
            this.name = name;
            this.steps = steps;
        }

        private String getName() {
            return name;
        }

        private String[] getSteps() {
            return steps;
        }

    }
}
