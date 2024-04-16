package org.rd99.ObserverPattern.Observable;

import org.rd99.ObserverPattern.Observer.CarEnthusiastsObserver;

public interface ObservableInterface {
    public void add(CarEnthusiastsObserver observer);

    //Ideally CarEnthusiastObserver should extend general interface observer
    public void remove(CarEnthusiastsObserver observer);
    public void updateStock(int StockCount);

    public int getStock();

    public void notifyCustomers();

}
