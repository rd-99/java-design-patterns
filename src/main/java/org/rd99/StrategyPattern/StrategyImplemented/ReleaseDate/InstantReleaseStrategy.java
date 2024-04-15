package org.rd99.StrategyPattern.StrategyImplemented.ReleaseDate;

import org.rd99.StrategyPattern.StrategyImplemented.ReleaseDate.ReleaseDateStrategy;

import java.util.Date;

public class InstantReleaseStrategy implements ReleaseDateStrategy {
    @Override
    public Date ReleaseDate(Date date) {
        return date;
    }
}
