package lowLevelDesign.DesignPatterns.BehavioralPatterns.ObserverPattern;


import lowLevelDesign.DesignPatterns.BehavioralPatterns.ObserverPattern.Observable.IphoneObservableImpl;
import lowLevelDesign.DesignPatterns.BehavioralPatterns.ObserverPattern.Observable.StockesObservable;
import lowLevelDesign.DesignPatterns.BehavioralPatterns.ObserverPattern.Observer.EmailAlertObserverImpl;
import lowLevelDesign.DesignPatterns.BehavioralPatterns.ObserverPattern.Observer.MobileAlertObserverImpl;
import lowLevelDesign.DesignPatterns.BehavioralPatterns.ObserverPattern.Observer.NotificationAlertObserver;

public class Store {
    public static void main(String[] args) {
        StockesObservable iphoneStockObservable = new IphoneObservableImpl();

        NotificationAlertObserver observer1 = new EmailAlertObserverImpl("xyz@gmail.com", iphoneStockObservable);
        NotificationAlertObserver observer2= new MobileAlertObserverImpl("abc@gmail.com", iphoneStockObservable);

        iphoneStockObservable.add(observer1);
        iphoneStockObservable.add(observer2);

        iphoneStockObservable.setStocksCount(10);
    }
}
