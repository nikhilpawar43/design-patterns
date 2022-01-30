package com.udemy.patterns.behavioural.mediator;

public interface UiControl {

    void controlChanged(UiControl control);

    String getControlName();

    String getControlValue();
}
