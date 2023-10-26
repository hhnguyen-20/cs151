package org.example.design_patterns.exercise3;

public class WeatherStation {

    public static void main(String[] args) {

        CurrentConditionsDisplay currentDisplay =
                new CurrentConditionsDisplay();
        StatisticsDisplay statisticsDisplay = new StatisticsDisplay();
        ForecastDisplay forecastDisplay = new ForecastDisplay();

        WeatherData weatherData = new WeatherData();

        weatherData.setCurrentConditionsDisplay(currentDisplay);
        weatherData.setForecastDisplay(forecastDisplay);
        weatherData.setStatisticsDisplay(statisticsDisplay);

        weatherData.setMeasurements(80, 65, 30.4f);
        weatherData.setMeasurements(82, 70, 29.2f);
        weatherData.setMeasurements(78, 90, 29.2f);

        weatherData.setMeasurements(62, 90, 28.1f);
    }
}

