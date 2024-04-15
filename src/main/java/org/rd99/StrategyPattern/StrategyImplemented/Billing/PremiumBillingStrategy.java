package org.rd99.StrategyPattern.StrategyImplemented.Billing;

import org.rd99.StrategyPattern.StrategyImplemented.Billing.BillingStrategy;

public class PremiumBillingStrategy implements BillingStrategy {
    @Override
    public void billCustomerEveryMonth() {
        //Call function to bill the Customer.
        System.out.println("Customer has been billed for premium content");
    }
}
