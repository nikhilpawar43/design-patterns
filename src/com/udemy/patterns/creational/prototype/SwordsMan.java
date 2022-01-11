package com.udemy.patterns.creational.prototype;

public class SwordsMan extends GameUnit {
    
    private String state;

    public SwordsMan() {
        this.state = "Idle";
    }

    @Override
    public void attack() {
        this.state = "With sword";
    }

    @Override
    public String toString() {
        return "SwordsMan attacking in direction: " + this.getAttackOrder().getDirection() 
                + " at position: " + this.getAttackOrder().getPosition() + " " + this.state;
    }
}
