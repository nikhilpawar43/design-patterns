package com.lynda.creation.design.patterns.factory.ch02;

import java.util.Collections;
import java.util.List;
import java.util.Objects;

public class CandyFactory {

    public List<Candy> getCandy(int quantity, String type) {
        Candy candy = getCandy(type);

        if (Objects.nonNull(candy)) {
            return candy.makeCandyPackage(quantity);
        }

        return Collections.emptyList();
    }

    private Candy getCandy(String type) {
        switch (type) {
            case "chocolate":
                return new Chocolate();

            case "hard candy":
                return new HardCandy();

            default:
                return null;
        }
    }
}
