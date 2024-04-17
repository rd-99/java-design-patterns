package org.rd99.DecoratorPattern;

public class BasicCar implements Car{
    public int cost = 0;

    @Override
    public void assemble() {
        System.out.println("Basic Car Assembled");
    }

    @Override
    public int productCost() {
        System.out.println("50k cost added for basic car. /n");
        return 50_000;
    }


}
