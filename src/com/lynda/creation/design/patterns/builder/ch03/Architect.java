package com.lynda.creation.design.patterns.builder.ch03;

import java.awt.*;
import java.util.Arrays;
import java.util.List;

public class Architect {

    public static void main(String[] args) {

        Room room1 = new RoomBuilder().withDimensions(new Dimension(200, 150))
                .withCeilingHeight(15)
                .withFloorNumber(1)
                .withWallColor(Color.WHITE)
                .withNumberOfDoors(2)
                .withNumberOfWindows(2)
                .build();

        Room room2 = new RoomBuilder().withDimensions(new Dimension(180, 130))
                .withCeilingHeight(15)
                .withFloorNumber(1)
                .withWallColor(Color.WHITE)
                .withNumberOfDoors(1)
                .withNumberOfWindows(3)
                .build();

        House house = new House(Arrays.asList(room1, room2));
        System.out.println("House: " + house);

        // Using a builder for creating a list of rooms
        List<Room> roomList = new RoomListBuilder().initializeRoomList()
                .addRoom().withDimensions(new Dimension(210, 160)).withWallColor(Color.WHITE).addToList()
                .addRoom().withDimensions(new Dimension(190, 140)).withWallColor(Color.LIGHT_GRAY).addToList()
                .createRoomList();

        House house2 = new House(roomList);
        System.out.println("House 2: " + house2);
    }
}
