package org.rd99.StrategyPattern.StrategyNotImplemented;

import java.util.Date;

public class PremiumCustomer extends Customer{
    @Override
    public void billCustomerEveryMonth() {
        //Call a function that bill a customer.
        System.out.println("Customer has been billed for premium content");
    }

    @Override
    public Date ReleaseDate(Date date) {
        return date;
    }
}
