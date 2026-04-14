package lowLevelDesign.DesignPatterns.BehavioralPatterns.ObserverWeatherExample.Observer;

public interface WeatherObserver {
    void update(float  temperature, float humidity, float pressure);
}
