package org.rd99.StrategyPattern.StrategyImplemented.CustomerObject;

import org.rd99.StrategyPattern.StrategyImplemented.Billing.PremiumBillingStrategy;
import org.rd99.StrategyPattern.StrategyImplemented.ReleaseDate.InstantReleaseStrategy;

public class PremiumCustomer extends Customer{
    public PremiumCustomer(){
        super(new PremiumBillingStrategy() , new InstantReleaseStrategy());
    }
}
