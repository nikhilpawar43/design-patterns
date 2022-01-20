package com.udemy.patterns.structural.composite;

public abstract class File {
    
    private String name;

    public File(String name) {
        this.name = name;
    }

    abstract void ls();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
