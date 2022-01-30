package com.udemy.patterns.behavioural.mediator;

import javafx.scene.control.Slider;

public class CustomSlider extends Slider implements UiControl {

    private UiMediator mediator;
    private boolean mediatedUpdate;

    public CustomSlider(UiMediator mediator) {
        this.mediator = mediator;

        this.setMin(0);
        this.setMax(50);
        this.setBlockIncrement(5);

        this.mediator.register(this);

        this.valueProperty().addListener((v, o, n) -> {
            if (!mediatedUpdate) {
                this.mediator.notifyColleagues(this);
            }
        });
    }

    @Override
    public void controlChanged(UiControl control) {
        this.mediatedUpdate = true;
        this.setValue(Double.valueOf(control.getControlValue()));
        this.mediatedUpdate = false;
    }

    @Override
    public String getControlName() {
        return "Slider";
    }

    @Override
    public String getControlValue() {
        return this.getValue() + "";
    }
}
