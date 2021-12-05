package com.lynda.creation.design.patterns.builder.ch03;

import java.util.List;

public class House {

    private List<Room> rooms;

    public House(List<Room> rooms) {
        this.rooms = rooms;
    }

    @Override
    public String toString() {
        return "House{" +
                "rooms=" + rooms +
                '}';
    }
}
