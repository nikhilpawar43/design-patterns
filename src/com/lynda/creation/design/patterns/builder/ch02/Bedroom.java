package com.lynda.creation.design.patterns.builder.ch02;

import java.awt.*;

public class Bedroom {

    private Dimension dimensions;
    private int ceilingHeight;
    private int floorNumber;
    private Color wallColor;
    private int numberOfWindows;
    private int numberOfDoors;
    private boolean isDouble;
    private boolean hasEnsuite;

    private Bedroom(Dimension dimensions, int ceilingHeight, int floorNumber, Color wallColor, int numberOfWindows, int numberOfDoors, boolean isDouble, boolean hasEnsuite) {
        this.dimensions = dimensions;
        this.ceilingHeight = ceilingHeight;
        this.floorNumber = floorNumber;
        this.wallColor = wallColor;
        this.numberOfWindows = numberOfWindows;
        this.numberOfDoors = numberOfDoors;
        this.isDouble = isDouble;
        this.hasEnsuite = hasEnsuite;
    }

    @Override
    public String toString() {
        return "Bedroom{" +
                "dimensions=" + dimensions +
                ", ceilingHeight=" + ceilingHeight +
                ", floorNumber=" + floorNumber +
                ", wallColor=" + wallColor +
                ", numberOfWindows=" + numberOfWindows +
                ", numberOfDoors=" + numberOfDoors +
                ", isDouble=" + isDouble +
                ", hasEnsuite=" + hasEnsuite +
                '}';
    }

    public static class BedroomBuilder implements Builder {

        private Dimension dimensions;
        private int ceilingHeight;
        private int floorNumber;
        private Color wallColor;
        private int numberOfWindows;
        private int numberOfDoors;
        private boolean isDouble;
        private boolean hasEnsuite;

        // mandatory fields
        public BedroomBuilder(Dimension dimensions, int ceilingHeight, int floorNumber, boolean isDouble) {
            this.dimensions = dimensions;
            this.ceilingHeight = ceilingHeight;
            this.floorNumber = floorNumber;
            this.isDouble = isDouble;
        }

        public BedroomBuilder withWallColor(Color wallColor) {
            this.wallColor = wallColor;
            return this;
        }

        public BedroomBuilder withNumberOfWindows(int numberOfWindows) {
            this.numberOfWindows = numberOfWindows;
            return this;
        }

        public BedroomBuilder withNumberOfDoors(int numberOfDoors) {
            this.numberOfDoors = numberOfDoors;
            return this;
        }

        public BedroomBuilder withHasEnsuite(boolean hasEnsuite) {
            this.hasEnsuite = hasEnsuite;
            return this;
        }

        public Bedroom build() {
            return new Bedroom(this.dimensions,
                    this.ceilingHeight,
                    this.floorNumber,
                    this.wallColor,
                    this.numberOfWindows,
                    this.numberOfDoors,
                    this.isDouble,
                    this.hasEnsuite);
        }
    }
}
