package org.rd99.StrategyPattern.StrategyImplemented.CustomerObject;

import org.rd99.StrategyPattern.StrategyImplemented.Billing.NoBillingStrategy;
import org.rd99.StrategyPattern.StrategyImplemented.ReleaseDate.DelayedReleaseStrategy;

public class FreeCustomer extends Customer{
        public FreeCustomer(){
            super(new NoBillingStrategy() , new DelayedReleaseStrategy());
        }
}
