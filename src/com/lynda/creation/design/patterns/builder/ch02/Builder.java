package com.lynda.creation.design.patterns.builder.ch02;

import java.awt.*;

public interface Builder {

    public Builder withWallColor(Color wallColor);

    public Builder withNumberOfWindows(int numberOfWindows);

    public Builder withNumberOfDoors(int numberOfDoors);

}
