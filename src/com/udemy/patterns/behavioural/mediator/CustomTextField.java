package com.udemy.patterns.behavioural.mediator;

import javafx.scene.control.TextField;

public class CustomTextField extends TextField implements UiControl {

    private UiMediator mediator;
    private boolean mediatedUpdate;

    public CustomTextField(UiMediator mediator) {
        this.mediator = mediator;
        this.setText("Custom Text Field");
        this.mediator.register(this);

        this.textProperty().addListener((v, o, n) -> {
            if (!mediatedUpdate) {
                this.mediator.notifyColleagues(this);
            }
        });
    }

    @Override
    public void controlChanged(UiControl control) {
        this.mediatedUpdate = true;
        this.setText(control.getControlValue());
        this.mediatedUpdate = false;
    }

    @Override
    public String getControlName() {
        return "Text field";
    }

    @Override
    public String getControlValue() {
        return getText();
    }
}
