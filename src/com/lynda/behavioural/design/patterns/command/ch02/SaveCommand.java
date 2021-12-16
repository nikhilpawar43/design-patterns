package com.lynda.behavioural.design.patterns.command.ch02;

public class SaveCommand implements Command {
    
    private Document document;

    public SaveCommand(Document document) {
        this.document = document;
    }

    @Override
    public void execute() {
        document.save();
    }
}
