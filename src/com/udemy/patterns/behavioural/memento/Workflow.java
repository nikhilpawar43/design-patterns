package com.udemy.patterns.behavioural.memento;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Workflow {

    private String name;
    private List<String> steps;

    public Workflow(String name) {
        this.name = name;
        this.steps = new LinkedList<>();
    }

    public Workflow(String name, String... steps) {
        this.name = name;
        this.steps = new LinkedList<>();
        Arrays.stream(steps).forEach(step -> this.steps.add(step));
    }

    public void addStep(String step) {
        this.steps.add(step);
    }

    public void removeStep(String step) {
        this.steps.remove(step);
    }

    public String getName() {
        return name;
    }

    public String[] getSteps() {
        String[] stepsArray = new String[this.steps.size()];
        return this.steps.toArray(stepsArray);
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Workflow name: ").append(name)
                .append("\n").append("[ Begin -> ");

        this.steps.forEach(step -> builder.append(step).append(" -> "));
        builder.append("End ]");

        return builder.toString();
    }
}
