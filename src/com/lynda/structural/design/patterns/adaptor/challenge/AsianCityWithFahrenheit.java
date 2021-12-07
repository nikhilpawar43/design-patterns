package com.lynda.structural.design.patterns.adaptor.challenge;

public class AsianCityWithFahrenheit implements City {
    
    private City asianCity;

    public AsianCityWithFahrenheit(City asianCity) {
        this.asianCity = asianCity;
    }

    @Override
    public String getName() {
        return asianCity.getName();
    }

    @Override
    public double getTemperature() {
        return (asianCity.getTemperature() * 9/5) + 32;
    }

    @Override
    public String getTemperatureScale() {
        return "Fahrenheit";
    }

    @Override
    public boolean getHasWeatherWarning() {
        return asianCity.getHasWeatherWarning();
    }

    @Override
    public void setHasWeatherWarning(boolean hasWeatherWarning) {
        this.asianCity.setHasWeatherWarning(hasWeatherWarning);
    }
}
