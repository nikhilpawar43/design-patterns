package com.lynda.creation.design.patterns.prototype.ch02;

public class Rabbit implements Cloneable {
    
    public enum Bread {
        HIMALAYAN, LION_HEAD, DUTCH
    } 
    
    private int age;
    
    private Bread bread;
    
    public Rabbit() {
        
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setBread(Bread bread) {
        this.bread = bread;
    }

    @Override
    protected Rabbit clone() {
        try {
            return (Rabbit) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }

    @Override
    public String toString() {
        return "Rabbit{" + "age=" + age + ", bread=" + bread + '}';
    }
}
