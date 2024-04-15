package org.rd99.StrategyPattern.StrategyImplemented;

import org.rd99.StrategyPattern.StrategyImplemented.CustomerObject.Customer;
import org.rd99.StrategyPattern.StrategyImplemented.CustomerObject.FreeCustomer;
import org.rd99.StrategyPattern.StrategyImplemented.CustomerObject.InhouseCustomer;
import org.rd99.StrategyPattern.StrategyImplemented.CustomerObject.PremiumCustomer;

import java.util.Date;

public class Main {
    public static void main(String[] args){
        Date CurrDate = new Date();

        Customer firstCustomer = new FreeCustomer();
        firstCustomer.billCustomerEveryMonth();
        Date firstCustomerReleaseDate = firstCustomer.ReleaseDate(CurrDate);
        System.out.println(firstCustomerReleaseDate); //One Week After Current Instant

        Customer secondCustomer = new PremiumCustomer();
        secondCustomer.billCustomerEveryMonth();
        Date secondCustomerReleaseDate = secondCustomer.ReleaseDate(CurrDate);
        System.out.println(secondCustomerReleaseDate);

        Customer thirdCustomer = new InhouseCustomer();
        thirdCustomer.billCustomerEveryMonth();
        Date thirdCustomerReleaseDate = thirdCustomer.ReleaseDate(CurrDate);
        System.out.println(thirdCustomerReleaseDate);
    }
}
