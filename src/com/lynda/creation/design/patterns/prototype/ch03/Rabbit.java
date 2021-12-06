package com.lynda.creation.design.patterns.prototype.ch03;

public class Rabbit implements Cloneable {
    
    public enum Bread {
        HIMALAYAN, LION_HEAD, DUTCH
    } 
    
    private int age;
    
    private Bread bread;
    
    private Person owner;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Bread getBread() {
        return bread;
    }

    public void setBread(Bread bread) {
        this.bread = bread;
    }

    public Person getOwner() {
        return owner;
    }

    public void setOwner(String name) {
        this.owner = new Person(name);
    }

    public void setOwner(Person owner) {
        this.owner = owner;
    }

    @Override
    protected Rabbit clone() {
        try {
            Rabbit rabbitCopy = (Rabbit) super.clone();
            
            // The immutable fields (e.g. class references) are shallow copied by default, thus we have to manually clone them and set in the original clone object
            Person personCopy = owner.clone();
            rabbitCopy.setOwner(personCopy);
            return rabbitCopy;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }

    @Override
    public String toString() {
        return "Rabbit{" + "age=" + age + ", bread=" + bread + ", owner=" + owner + '}';
    }
}
