package lowLevelDesign.DesignPatterns.BehavioralPatterns.ObserverWeatherExample.Observable;

import lowLevelDesign.DesignPatterns.BehavioralPatterns.ObserverWeatherExample.Observer.WeatherObserver;

public interface WeatherObservable {

    void addObserver(WeatherObserver weatherObserver);
    void removeObserver(WeatherObserver weatherObserver);
    void notifyObservers();
}


// this is push model approach
