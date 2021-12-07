package com.lynda.structural.design.patterns.adaptor.challenge;

public class NorthAmericanCity implements City {
    
    private String name;
    private double temperature;
    private boolean hasWeatherWarning;

    public NorthAmericanCity(String name, double temperature) {
        this.name = name;
        this.temperature = temperature;
        this.hasWeatherWarning = false;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getTemperature() {
        return temperature;
    }

    @Override
    public String getTemperatureScale() {
        return "Fahrenheit";
    }

    @Override
    public boolean getHasWeatherWarning() {
        return hasWeatherWarning;
    }

    @Override
    public void setHasWeatherWarning(boolean hasWeatherWarning) {
        this.hasWeatherWarning = hasWeatherWarning;
    }
}
