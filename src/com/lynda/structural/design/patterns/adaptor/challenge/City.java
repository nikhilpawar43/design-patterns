package com.lynda.structural.design.patterns.adaptor.challenge;

public interface City {
    
    String getName();
    double getTemperature();
    String getTemperatureScale();
    boolean getHasWeatherWarning();
    void setHasWeatherWarning(boolean hasWeatherWarning);
}
