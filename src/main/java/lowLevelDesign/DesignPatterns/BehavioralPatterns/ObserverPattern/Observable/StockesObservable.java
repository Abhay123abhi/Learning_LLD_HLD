package lowLevelDesign.DesignPatterns.BehavioralPatterns.ObserverPattern.Observable;

import lowLevelDesign.DesignPatterns.BehavioralPatterns.ObserverPattern.Observer.NotificationAlertObserver;

public interface StockesObservable {
    public void add(NotificationAlertObserver observer);

    public void remove(NotificationAlertObserver observer);

    public void notifySubscribers();

    public void setStocksCount(int newStockAdded);

    public int getStockCount();
}
