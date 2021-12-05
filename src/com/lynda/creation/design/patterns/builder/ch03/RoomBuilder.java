package com.lynda.creation.design.patterns.builder.ch03;

import java.awt.*;

public class RoomBuilder {

    private Dimension dimensions;
    private int ceilingHeight;
    private int floorNumber;
    private Color wallColor;
    private int numberOfWindows;
    private int numberOfDoors;
    private RoomListBuilder roomListBuilder;

    public RoomBuilder() {

    }

    public RoomBuilder(RoomListBuilder roomListBuilder) {
        this.roomListBuilder = roomListBuilder;
    }

    public RoomBuilder withDimensions(Dimension dimensions) {
        this.dimensions = dimensions;
        return this;
    }

    public RoomBuilder withCeilingHeight(int ceilingHeight) {
        this.ceilingHeight = ceilingHeight;
        return this;
    }

    public RoomBuilder withFloorNumber(int floorNumber) {
        this.floorNumber = floorNumber;
        return this;
    }

    public RoomBuilder withWallColor(Color wallColor) {
        this.wallColor = wallColor;
        return this;
    }

    public RoomBuilder withNumberOfWindows(int numberOfWindows) {
        this.numberOfWindows = numberOfWindows;
        return this;
    }

    public RoomBuilder withNumberOfDoors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
        return this;
    }

    public Room build() {
        return new Room(this.dimensions,
                this.ceilingHeight,
                this.floorNumber,
                this.wallColor,
                this.numberOfWindows,
                this.numberOfDoors);
    }

    public RoomListBuilder addToList() {
        Room room = build();
        this.roomListBuilder.addRoom(room);
        return roomListBuilder;
    }
}
