package org.rd99.StrategyPattern.StrategyImplemented.Billing;

import org.rd99.StrategyPattern.StrategyImplemented.Billing.BillingStrategy;

public class NoBillingStrategy implements BillingStrategy {


    @Override
    public void billCustomerEveryMonth() {
        System.out.println("No bill to be generated for free/inhouse customers.");
    }
}
