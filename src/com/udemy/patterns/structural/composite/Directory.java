package com.udemy.patterns.structural.composite;

import java.util.ArrayList;
import java.util.List;

public class Directory extends File {
    
    private List<File> children = new ArrayList<>();
    
    public Directory(String name) {
        super(name);
    }
    
    public void addFile(File file) {
        this.children.add(file);
    }

    @Override
    void ls() {
        System.out.println("-- Directory: " + getName());
        this.children.forEach(File::ls);
    }
}
