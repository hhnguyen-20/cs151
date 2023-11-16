package org.example.design_patterns.exercise3;
	
public class CurrentConditionsDisplay implements Observer, DisplayElement {
	private float temperature;
	private float humidity;
	private WeatherData weatherData;
	
	public CurrentConditionsDisplay(WeatherData weatherData) {
		this.weatherData = weatherData;
		weatherData.registerObserver(this);
	}
	
	public void update(float temperature, float humidity, float pressure) {
		this.temperature = temperature;
		this.humidity = humidity;
		display();
	}
	
	public void display() {
		System.out.println("Current conditions: " + temperature 
			+ "F degrees and " + humidity + "% humidity");
	}

	// Write positive unit tests
	public static void main(String[] args) {
		WeatherData weatherData = new WeatherData();
		CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);

		weatherData.setMeasurements(80, 65, 30.4f);
	}
}
