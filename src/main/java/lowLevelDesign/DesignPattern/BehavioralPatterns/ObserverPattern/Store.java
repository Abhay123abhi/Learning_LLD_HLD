package lowLevelDesign.DesignPattern.BehavioralPatterns.ObserverPattern;


import lowLevelDesign.DesignPattern.BehavioralPatterns.ObserverPattern.Observable.IphoneObservableImpl;
import lowLevelDesign.DesignPattern.BehavioralPatterns.ObserverPattern.Observable.StockesObservable;
import lowLevelDesign.DesignPattern.BehavioralPatterns.ObserverPattern.Observer.EmailAlertObserverImpl;
import lowLevelDesign.DesignPattern.BehavioralPatterns.ObserverPattern.Observer.MobileAlertObserverImpl;
import lowLevelDesign.DesignPattern.BehavioralPatterns.ObserverPattern.Observer.NotificationAlertObserver;

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
