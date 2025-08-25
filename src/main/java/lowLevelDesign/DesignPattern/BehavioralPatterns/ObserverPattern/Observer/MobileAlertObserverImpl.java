package lowLevelDesign.DesignPattern.BehavioralPatterns.ObserverPattern.Observer;


import lowLevelDesign.DesignPattern.BehavioralPatterns.ObserverPattern.Observable.StockesObservable;

public class MobileAlertObserverImpl implements  NotificationAlertObserver{

    String userName;
    StockesObservable observable;

    public MobileAlertObserverImpl(String emailId, StockesObservable observable){
        this.userName=emailId;
        this.observable=observable;
    }

    @Override
    public void update() {
        sendMsgOnMobile(userName,"Product is in stock hurry up!");
    }

    private void sendMsgOnMobile(String userName, String msg) {
        System.out.println("msg sent to "+userName);
    }
}
