package org.rd99.StrategyPattern.StrategyImplemented.CustomerObject;

import org.rd99.StrategyPattern.StrategyImplemented.Billing.BillingStrategy;
import org.rd99.StrategyPattern.StrategyImplemented.Billing.NoBillingStrategy;
import org.rd99.StrategyPattern.StrategyImplemented.ReleaseDate.ReleaseDateStrategy;

import java.util.Date;

public class Customer {

    private int customerId;
    private String Name;

//    public abstract void billCustomerEveryMonth();
//    public abstract Date ReleaseDate(Date date);

    BillingStrategy billingStrategyObject;
    ReleaseDateStrategy releaseDateStrategyObject;


    Customer(BillingStrategy billingStrategyObject , ReleaseDateStrategy releaseDateStrategyObject){
        this.billingStrategyObject = billingStrategyObject;
        this.releaseDateStrategyObject = releaseDateStrategyObject;
    }

    public void billCustomerEveryMonth(){
        billingStrategyObject.billCustomerEveryMonth();
    }
    public Date ReleaseDate(Date date){
        return releaseDateStrategyObject.ReleaseDate(date);
    }
}
