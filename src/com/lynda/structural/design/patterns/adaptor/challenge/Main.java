package com.lynda.structural.design.patterns.adaptor.challenge;

public class Main {

    public static void main(String[] args) {
        
        City chicago = new NorthAmericanCity("Chicago", 16);
        City phoenix = new NorthAmericanCity("Phoenix", 104);
        City portland = new NorthAmericanCity("Portland", 70);
        City bangkok = new AsianCity("Bangkok", 50);
        
        City bangkokWithFahrenheit = new AsianCityWithFahrenheit(bangkok);
        
        WeatherWarning weatherWarning = new WeatherWarning();
        weatherWarning.postWeatherWarning(chicago);
        weatherWarning.postWeatherWarning(phoenix);
        weatherWarning.postWeatherWarning(portland);
        weatherWarning.postWeatherWarning(bangkok);
        weatherWarning.postWeatherWarning(bangkokWithFahrenheit);
    }
}
