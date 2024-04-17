package org.rd99.DecoratorPattern;

public class SportsCar extends CarDecorator{
    public enum CarColor{
        RED,
        BLACK,

    }
    CarColor color;
    public SportsCar(Car c , CarColor color) {
        super(c);
        this.color = color;
    }
    @Override
    public void assemble(){
        super.assemble();
        System.out.println("Adding features of Sports Car");
    }

    @Override
    public int productCost(){
        int sportCarCost = 10000;
        System.out.println("Adding Sports Car Cost");
        return sportCarCost + super.productCost();
    }
}
