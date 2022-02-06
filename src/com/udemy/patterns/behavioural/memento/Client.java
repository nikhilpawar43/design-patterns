package com.udemy.patterns.behavioural.memento;

import java.util.LinkedList;

public class Client {

    public static void main(String[] args) {

        WorkflowDesigner designer = new WorkflowDesigner();
        LinkedList<WorkflowCommand> commands = runCommands(designer);
        designer.print();

        commands.removeLast().undo();
        designer.print();
    }

    private static LinkedList<WorkflowCommand> runCommands(WorkflowDesigner designer) {
        LinkedList<WorkflowCommand> commands = new LinkedList<>();

        WorkflowCommand command1 = new CreateCommand(designer, "Leave workflow");
        commands.add(command1);
        command1.execute();

        WorkflowCommand command2 = new AddStepWorkflowCommand(designer, "Create leave application");
        commands.add(command2);
        command2.execute();

        WorkflowCommand command3 = new AddStepWorkflowCommand(designer, "Submit leave application");
        commands.add(command3);
        command3.execute();

        WorkflowCommand command4 = new AddStepWorkflowCommand(designer, "Application approved");
        commands.add(command4);
        command4.execute();

        return commands;
    }
}
