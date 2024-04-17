package org.rd99.DecoratorPattern;

public class LuxuryCar extends CarDecorator{
    public LuxuryCar(Car c) {
        super(c);
    }
    @Override
    public void assemble(){
        super.assemble();
        System.out.println("Adding features of Luxury Car");
    }
    @Override
    public int productCost(){
        int luxuryCarCost = 25_000;
        System.out.println("Adding Sports Car Cost");
        return luxuryCarCost + super.productCost();
    }
}
