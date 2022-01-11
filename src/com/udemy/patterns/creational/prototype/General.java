package com.udemy.patterns.creational.prototype;

public class General extends GameUnit {

    private String state;

    public General() {
        this.state = "Idle";
    }
    
    @Override
    public void attack() {
        this.state = "Boost Moral";
    }

    @Override
    protected GameUnit clone() throws CloneNotSupportedException {
        throw new CloneNotSupportedException("General is not meant for cloning !");
    }

    @Override
    public String toString() {
        return "General attaching in direction: " + this.getAttackOrder().getDirection() 
                + " at position: " + this.getAttackOrder().getPosition() + " " + this.state;
    }
}
