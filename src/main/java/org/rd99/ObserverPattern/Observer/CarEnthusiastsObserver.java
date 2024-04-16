package org.rd99.ObserverPattern.Observer;

import org.rd99.ObserverPattern.Observable.ObservableCar;

public class CarEnthusiastsObserver implements ObserverInterface{
    private String emailId;
    private ObservableCar popularCar;
    public CarEnthusiastsObserver(String emailId , ObservableCar popularCar) {
        this.emailId = emailId;
        this.popularCar = popularCar;
    }

    @Override
    public void updateCustomer() {
        // probably implement a queue here to notify all customers.
        System.out.println(String.format("Notified enthusiast %s about the new stock." , this.emailId));
    }

    public int getStock(){
        return popularCar.getStock();
    }
    public String getEmailId() {
        return emailId;
    }
}
