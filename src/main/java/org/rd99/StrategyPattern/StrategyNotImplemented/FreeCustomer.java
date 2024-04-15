package org.rd99.StrategyPattern.StrategyNotImplemented;

import java.util.Calendar;
import java.util.Date;

public class FreeCustomer extends Customer {

    @Override
    public void billCustomerEveryMonth() {
        System.out.println("No bill to be generated for free/inhouse customers.");
    }

    //No early access for Free customer. 1 week late for free customers
    @Override
    public Date ReleaseDate(Date date) {
        Calendar ReleaseForFreeCustomers = Calendar.getInstance();
        ReleaseForFreeCustomers.setTime(date);
        ReleaseForFreeCustomers.add(Calendar.DATE , 7);
        return ReleaseForFreeCustomers.getTime();
    }
}
