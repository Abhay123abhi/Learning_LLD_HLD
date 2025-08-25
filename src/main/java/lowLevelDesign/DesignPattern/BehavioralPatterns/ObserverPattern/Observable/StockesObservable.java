package lowLevelDesign.DesignPattern.BehavioralPatterns.ObserverPattern.Observable;

import lowLevelDesign.DesignPattern.BehavioralPatterns.ObserverPattern.Observer.NotificationAlertObserver;

public interface StockesObservable {
    public void add(NotificationAlertObserver observer);

    public void remove(NotificationAlertObserver observer);

    public void notifySubscribers();

    public void setStocksCount(int newStockAdded);

    public int getStockCount();
}
