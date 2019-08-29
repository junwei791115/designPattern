package tw.com.observerPattern.observer.impl;

import tw.com.observerPattern.observer.DisplayElement;
import tw.com.observerPattern.observer.Observer;
import tw.com.observerPattern.subject.Subject;

public class CurrentConditionsDisplay implements Observer, DisplayElement {

	private float temperature;
	private float humidity;
	private Subject weatherData;
	
	public CurrentConditionsDisplay(Subject weatherData) {
		this.weatherData = weatherData;
		weatherData.registerObserver(this);
	}

	@Override
	public void display() {
		System.out.println("Current conditions:"+ this.temperature+" F degrees and " + this.humidity + "% humidity");
	}

	@Override
	public void update(float temp, float humidity, float pressure) {
		System.out.println("CurrentConditionsDisplay update");
		this.humidity = humidity;
		this.temperature = temp;
		this.display();

	}

}
