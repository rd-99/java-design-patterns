package org.rd99.StrategyPattern.StrategyImplemented.ReleaseDate;

import org.rd99.StrategyPattern.StrategyImplemented.ReleaseDate.ReleaseDateStrategy;

import java.util.Calendar;
import java.util.Date;

public class DelayedReleaseStrategy implements ReleaseDateStrategy {
    @Override
    public Date ReleaseDate(Date date) {
        Calendar ReleaseForFreeCustomers = Calendar.getInstance();
        ReleaseForFreeCustomers.setTime(date);
        ReleaseForFreeCustomers.add(Calendar.DATE , 7);
        return ReleaseForFreeCustomers.getTime();
    }
}
