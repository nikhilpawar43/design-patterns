package com.lynda.creation.design.patterns.builder.ch03;

import java.util.ArrayList;
import java.util.List;

public class RoomListBuilder {

    private List<Room> rooms;

    public RoomListBuilder initializeRoomList() {
        rooms = new ArrayList<>();
        return this;
    }

    public RoomBuilder addRoom() {
        return new RoomBuilder(this);
    }

    public void addRoom(Room room) {
        rooms.add(room);
    }

    public List<Room> createRoomList() {
        return rooms;
    }
}
