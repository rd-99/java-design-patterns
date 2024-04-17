package org.rd99.DecoratorPattern;

public class Main {

        public static void main(String[] args) {
            Car sportsCar = new SportsCar(new BasicCar() , SportsCar.CarColor.BLACK);
            sportsCar.assemble();
            System.out.println("\n*****");

            Car sportsLuxuryCar = new SportsCar(new LuxuryCar(new BasicCar()),SportsCar.CarColor.RED);
            sportsLuxuryCar.assemble();
            int totalCostOfCar = sportsLuxuryCar.productCost();
            System.out.println(totalCostOfCar);
        }
}
