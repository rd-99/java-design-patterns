package org.rd99.StrategyPattern.StrategyNotImplemented;

import java.util.Date;

//In this example, Billing code is duplicated for Inhouse/Free customer
// while Release Date functionality is duplicated for Inhouse/Premium customer.
//Lets solve that issue by using Strategy D.P.
public abstract class Customer {

    private int customerId;
    private String Name;

    public abstract void billCustomerEveryMonth();

    public abstract Date ReleaseDate(Date date);

}
