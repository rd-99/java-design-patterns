package org.rd99.ObserverPattern;
import org.rd99.ObserverPattern.Observable.ObservableCar;
import org.rd99.ObserverPattern.Observer.CarEnthusiastsObserver;

import java.util.UUID;

public class Main {
    public static void main(String[] args){
        ObservableCar Ferrari = new ObservableCar(0);
        // Convert the UUID to a string and append it to a domain to create a random email ID
        CarEnthusiastsObserver customer1 = new CarEnthusiastsObserver(String.format("%s@example.com" ,UUID.randomUUID().toString()) , Ferrari);
        CarEnthusiastsObserver customer2 = new CarEnthusiastsObserver(String.format("%s@example.com" ,UUID.randomUUID().toString()) , Ferrari);
        CarEnthusiastsObserver customer3 = new CarEnthusiastsObserver(String.format("%s@example.com" ,UUID.randomUUID().toString()) , Ferrari);
        Ferrari.add(customer1);
        Ferrari.add(customer2);
        Ferrari.add(customer3);

        Ferrari.updateStock(25);

    }




}
