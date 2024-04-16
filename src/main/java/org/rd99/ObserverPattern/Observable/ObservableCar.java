package org.rd99.ObserverPattern.Observable;

import org.rd99.ObserverPattern.Observer.CarEnthusiastsObserver;

import java.util.ArrayList;
import java.util.List;

public class ObservableCar implements ObservableInterface{

    List<CarEnthusiastsObserver> customers= new ArrayList<>();
    private int stockCount = 0;
    public ObservableCar(int stockCount){
        this.stockCount = stockCount;
    }
    @Override
    public void add(CarEnthusiastsObserver observer) {
        //First check if he is a valid customer.
        customers.add(observer);
    }

    @Override
    public void remove(CarEnthusiastsObserver observer) {
        customers.remove(observer);
    }
    @Override
    public void updateStock(int count) {
        if(stockCount == 0){
            notifyCustomers();
        }
        stockCount += count;
    }
    @Override
    public int getStock() {
        return stockCount;
    }

    @Override
    public void notifyCustomers() {
        for(CarEnthusiastsObserver observer : customers){
            observer.updateCustomer();
        }

    }
}
