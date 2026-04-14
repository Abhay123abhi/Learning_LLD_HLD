package lowLevelDesign.DesignPatterns.BehavioralPatterns.ObserverWeatherExample.Observer;

import lowLevelDesign.DesignPatterns.BehavioralPatterns.ObserverWeatherExample.Observable.WeatherObservable;

public class ForecastDisplay implements WeatherObserver {

    @Override
    public void update(float temperature, float humidity, float pressure) {
        System.out.println("Forecast Display updated");
        System.out.println("temperature: " + temperature + " humidity: " + humidity + " pressure: " + pressure);
    }
}
