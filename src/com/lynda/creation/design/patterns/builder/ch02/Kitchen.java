package com.lynda.creation.design.patterns.builder.ch02;

import java.awt.*;

public class Kitchen {

    private Dimension dimensions;
    private int ceilingHeight;
    private int floorNumber;
    private Color wallColor;
    private int numberOfWindows;
    private int numberOfDoors;
    private boolean hasDishwasher;
    private boolean hasMicrowave;

    public Kitchen(Dimension dimensions, int ceilingHeight, int floorNumber, Color wallColor, int numberOfWindows, int numberOfDoors, boolean hasDishwasher, boolean hasMicrowave) {
        this.dimensions = dimensions;
        this.ceilingHeight = ceilingHeight;
        this.floorNumber = floorNumber;
        this.wallColor = wallColor;
        this.numberOfWindows = numberOfWindows;
        this.numberOfDoors = numberOfDoors;
        this.hasDishwasher = hasDishwasher;
        this.hasMicrowave = hasMicrowave;
    }

    @Override
    public String toString() {
        return "Kitchen{" +
                "dimensions=" + dimensions +
                ", ceilingHeight=" + ceilingHeight +
                ", floorNumber=" + floorNumber +
                ", wallColor=" + wallColor +
                ", numberOfWindows=" + numberOfWindows +
                ", numberOfDoors=" + numberOfDoors +
                ", hasDishwasher=" + hasDishwasher +
                ", hasMicrowave=" + hasMicrowave +
                '}';
    }

    public static class KitchenBuilder implements Builder {

        private Dimension dimensions;
        private int ceilingHeight;
        private int floorNumber;
        private Color wallColor;
        private int numberOfWindows;
        private int numberOfDoors;
        private boolean hasDishwasher;
        private boolean hasMicrowave;

        // mandatory fields
        public KitchenBuilder(Dimension dimensions, int ceilingHeight, int floorNumber) {
            this.dimensions = dimensions;
            this.ceilingHeight = ceilingHeight;
            this.floorNumber = floorNumber;
        }

        public KitchenBuilder withWallColor(Color wallColor) {
            this.wallColor = wallColor;
            return this;
        }

        public KitchenBuilder withNumberOfWindows(int numberOfWindows) {
            this.numberOfWindows = numberOfWindows;
            return this;
        }

        public KitchenBuilder withNumberOfDoors(int numberOfDoors) {
            this.numberOfDoors = numberOfDoors;
            return this;
        }

        public KitchenBuilder withHasDishwasher(boolean hasDishwasher) {
            this.hasDishwasher = hasDishwasher;
            return this;
        }

        public KitchenBuilder withHasMicrowave(boolean hasMicrowave) {
            this.hasMicrowave = hasMicrowave;
            return this;
        }

        public Kitchen build() {
            return new Kitchen(this.dimensions,
                    this.ceilingHeight,
                    this.floorNumber,
                    this.wallColor,
                    this.numberOfWindows,
                    this.numberOfDoors,
                    this.hasDishwasher,
                    this.hasMicrowave);
        }
    }
}
