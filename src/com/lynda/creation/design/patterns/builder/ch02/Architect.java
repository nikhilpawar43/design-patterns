package com.lynda.creation.design.patterns.builder.ch02;

import com.lynda.creation.design.patterns.builder.ch02.Bedroom.BedroomBuilder;

import java.awt.*;

public class Architect {

    public static void main(String[] args) {

        Bedroom bedroom = new BedroomBuilder(new Dimension(200, 250), 15, 1, false)
                                .withWallColor(Color.WHITE)
                                .withNumberOfDoors(2)
                                .withNumberOfWindows(2)
                                .withHasEnsuite(false)
                                .build();

        System.out.println(bedroom);

        Kitchen kitchen = new Kitchen.KitchenBuilder(new Dimension(150, 120), 15, 1)
                                .withWallColor(Color.WHITE)
                                .withNumberOfDoors(2)
                                .withNumberOfWindows(2)
                                .withHasMicrowave(false)
                                .withHasDishwasher(false)
                                .build();

        System.out.println(kitchen);
    }
}
