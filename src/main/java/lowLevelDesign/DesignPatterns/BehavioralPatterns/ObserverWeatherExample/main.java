package lowLevelDesign.DesignPatterns.BehavioralPatterns.ObserverWeatherExample;

import lowLevelDesign.DesignPatterns.BehavioralPatterns.ObserverWeatherExample.Observable.WeatherStation;
import lowLevelDesign.DesignPatterns.BehavioralPatterns.ObserverWeatherExample.Observer.ForecastDisplay;
import lowLevelDesign.DesignPatterns.BehavioralPatterns.ObserverWeatherExample.Observer.WeatherObserver;

public class main {
    public static void main(String[] args) {
        WeatherStation weatherStation = new WeatherStation();
        WeatherObserver forecastDisplay  = new ForecastDisplay();

        weatherStation.addObserver(forecastDisplay);
        weatherStation.setState(32.5f, 70f, 1012f);
    }
}
