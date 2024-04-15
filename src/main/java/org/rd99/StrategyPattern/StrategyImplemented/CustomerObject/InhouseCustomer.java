package org.rd99.StrategyPattern.StrategyImplemented.CustomerObject;

import org.rd99.StrategyPattern.StrategyImplemented.Billing.NoBillingStrategy;
import org.rd99.StrategyPattern.StrategyImplemented.ReleaseDate.InstantReleaseStrategy;

public class InhouseCustomer extends Customer {

    public InhouseCustomer(){
        super(new NoBillingStrategy() , new InstantReleaseStrategy());
    }
}
