package tw.com.observerPattern.subject.impl;

import java.util.ArrayList;
import java.util.List;

import tw.com.observerPattern.observer.Observer;
import tw.com.observerPattern.subject.Subject;

public class WeatherData implements Subject {
	
	private List<Observer> observers;
	private float temperature;
	private float humidity;
	private float pressure;
	
	public WeatherData() {
		observers = new ArrayList<Observer>();
	}

	@Override
	public void registerObserver(Observer o) {
		observers.add(o);
	}

	@Override
	public void removeObderver(Observer o) {
		int i = observers.indexOf(o);
		if(i>0) {
			observers.remove(i);
		}
	}

	@Override
	public void notifyObderver() {
		for (int i = 0; i < observers.size(); i++) {
			Observer observer = observers.get(i);
			observer.update(temperature, humidity, pressure);
		}
	}
	
	public void measurementsChanged() {
		this.notifyObderver();
	}
	
	public void setMeasurements(float temperature, float humidity, float pressure) {
		this.temperature = temperature;
		this.humidity = humidity;
		this.pressure = pressure;
		this.measurementsChanged();
	}

}
