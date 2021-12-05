package com.lynda.creation.design.patterns.builder.ch03;

import java.awt.*;

public class Room {

    private Dimension dimensions;
    private int ceilingHeight;
    private int floorNumber;
    private Color wallColor;
    private int numberOfWindows;
    private int numberOfDoors;

    public Room(Dimension dimensions, int ceilingHeight, int floorNumber, Color wallColor, int numberOfWindows, int numberOfDoors) {
        this.dimensions = dimensions;
        this.ceilingHeight = ceilingHeight;
        this.floorNumber = floorNumber;
        this.wallColor = wallColor;
        this.numberOfWindows = numberOfWindows;
        this.numberOfDoors = numberOfDoors;
    }

    @Override
    public String toString() {
        return "Room{" +
                "dimensions=" + dimensions +
                ", ceilingHeight=" + ceilingHeight +
                ", floorNumber=" + floorNumber +
                ", wallColor=" + wallColor +
                ", numberOfWindows=" + numberOfWindows +
                ", numberOfDoors=" + numberOfDoors +
                '}';
    }
}
