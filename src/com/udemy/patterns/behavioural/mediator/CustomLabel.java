package com.udemy.patterns.behavioural.mediator;

import javafx.scene.control.Label;

public class CustomLabel extends Label implements UiControl {

    private UiMediator mediator;

    public CustomLabel(UiMediator mediator) {
        this.mediator = mediator;
        this.mediator.register(this);

        this.setMinWidth(100);
        this.setText("Custom Label");
    }

    @Override
    public void controlChanged(UiControl control) {
        setText(control.getControlValue());
    }

    @Override
    public String getControlName() {
        return "Label";
    }

    @Override
    public String getControlValue() {
        return getText();
    }
}
