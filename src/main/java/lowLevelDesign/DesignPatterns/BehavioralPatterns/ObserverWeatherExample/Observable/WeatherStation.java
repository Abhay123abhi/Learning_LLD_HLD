package lowLevelDesign.DesignPatterns.BehavioralPatterns.ObserverWeatherExample.Observable;

import lowLevelDesign.DesignPatterns.BehavioralPatterns.ObserverWeatherExample.Observer.WeatherObserver;

import java.util.ArrayList;
import java.util.List;

public class WeatherStation implements WeatherObservable{
    List<WeatherObserver> observers;

    //weatherData
    private float temperature;
    private float humidity;
    private float pressure;

    public WeatherStation(){
        observers = new ArrayList<>();
    }

    @Override
    public void addObserver(WeatherObserver weatherObserver) {
        observers.add(weatherObserver);
    }

    @Override
    public void removeObserver(WeatherObserver weatherObserver) {
        observers.remove(weatherObserver);
    }

    @Override
    public void notifyObservers() {
         for(WeatherObserver observer : observers){
             observer.update(temperature, humidity, pressure);
         }
    }

    public void setState(float temp, float humidity, float pressure) {
        this.temperature = temp;
        this.humidity = humidity;
        this.pressure = pressure;
        notifyObservers();
    }
}
