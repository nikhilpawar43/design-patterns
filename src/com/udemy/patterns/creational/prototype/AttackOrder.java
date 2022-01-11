package com.udemy.patterns.creational.prototype;

public class AttackOrder implements Cloneable {

    private String direction;
    private Long position;

    public AttackOrder(String direction, Long position) {
        this.direction = direction;
        this.position = position;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }

    public Long getPosition() {
        return position;
    }

    public void setPosition(Long position) {
        this.position = position;
    }
}
