package com.lynda.structural.design.patterns.facade.challenge;

public class CarFacade {
    
    public void drive() {
        Ignition ignition = new Ignition();
        Clutch clutch = new Clutch();
        Accelarator accelarator = new Accelarator();
        GearStick gearStick = new GearStick();
        HandBreak handBreak = new HandBreak();

        ignition.turnOn();
        clutch.press();
        gearStick.changeGear(1);
        accelarator.press();
        clutch.lift();
        handBreak.pushDown();
        accelarator.press();
        clutch.press();
    }
}
