package org.rd99.DecoratorPattern;

public class CarDecorator implements Car{
    protected Car car;

    public CarDecorator(Car c){
        this.car = c;
    }
    @Override
    public void assemble() {
        this.car.assemble();
    }
    @Override
    public int productCost(){
        return this.car.productCost();
    }
}
