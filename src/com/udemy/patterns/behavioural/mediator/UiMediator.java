package com.udemy.patterns.behavioural.mediator;

import java.util.ArrayList;
import java.util.List;

public class UiMediator {

    private List<UiControl> colleagues = new ArrayList<>();

    public void register(UiControl control) {
        colleagues.add(control);
    }

    public void notifyColleagues(UiControl control) {
        colleagues.stream().filter(c -> c != control).forEach(c -> c.controlChanged(control));
    }
}
