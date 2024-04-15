package org.rd99.StrategyPattern.StrategyNotImplemented;

import java.util.Date;

public class InhouseCustomer extends Customer{
    @Override
    public void billCustomerEveryMonth() {
        System.out.println("No bill to be generated for free/inhouse customers.");
    }

    @Override
    public Date ReleaseDate(Date date) {
        return date;
    }
}
