package com.lynda.structural.design.patterns.adaptor.challenge;

public class WeatherWarning {
    
    private static final double MIN_TEMPERATURE = 16;
    private static final double MAX_TEMPERATURE = 100;
    
    public void postWeatherWarning(City city) {
        if (city.getTemperature() <= MIN_TEMPERATURE || city.getTemperature() >= MAX_TEMPERATURE) {
            System.out.println("Warning! Current temperature in " + city.getName() + " is " + city.getTemperature() + " " + city.getTemperatureScale());
            city.setHasWeatherWarning(true);
        } else {
            System.out.println("The temperature of " + city.getName() + " is OK.");
        }
    }
}
