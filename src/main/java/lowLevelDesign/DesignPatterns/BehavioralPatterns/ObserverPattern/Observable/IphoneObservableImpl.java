package lowLevelDesign.DesignPatterns.BehavioralPatterns.ObserverPattern.Observable;


import lowLevelDesign.DesignPatterns.BehavioralPatterns.ObserverPattern.Observer.NotificationAlertObserver;

import java.util.ArrayList;
import java.util.List;

public class IphoneObservableImpl implements StockesObservable{

    public List<NotificationAlertObserver> observerList = new ArrayList<>();
    public int stockCount=0;

    @Override
    public void add(NotificationAlertObserver observer) {
        observerList.add(observer);
    }

    @Override
    public void remove(NotificationAlertObserver observer) {
        observerList.remove(observer);
    }

    @Override
    public void notifySubscribers() {
        for(NotificationAlertObserver observer:observerList){
            observer.update();
        }
    }

    @Override
    public void setStocksCount(int newStockAdded) {
        if(stockCount==0){
            notifySubscribers();
        }
        stockCount=stockCount+newStockAdded;
    }

    @Override
    public int getStockCount() {
        return stockCount;
    }
}
