package lowLevelDesign.DesignPatterns.BehavioralPatterns.ObserverPattern.Observer;


import lowLevelDesign.DesignPatterns.BehavioralPatterns.ObserverPattern.Observable.StockesObservable;

public class EmailAlertObserverImpl implements NotificationAlertObserver{

    String emailId;
    StockesObservable observable;

    public EmailAlertObserverImpl(String emailId, StockesObservable observable){
        this.emailId=emailId;
        this.observable=observable;
    }

    @Override
    public void update() {
        sendMail(emailId,"Product is in stock hurry up!");
    }

    private void sendMail(String emailId, String msg){
        System.out.println("mail send to maid id "+emailId);
    }

}
