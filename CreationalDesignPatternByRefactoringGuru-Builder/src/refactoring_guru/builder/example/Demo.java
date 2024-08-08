package refactoring_guru.builder.example;

import refactoring_guru.builder.example.builders.CarBuilder;
import refactoring_guru.builder.example.cars.Car;
import refactoring_guru.builder.example.director.Director;

/**
 * Demo class. Everything comes together here.
 */
public class Demo {

    public static void main(String[] args) {
        Director director = new Director();

        // Director gets the concrete builder object from the client
        // (application code). That's because application knows better which
        // builder to use to get a specific product.
        CarBuilder builder1 = new CarBuilder();
        director.constructSportsCar(builder1);

        // The final product is often retrieved from a builder object, since
        // Director is not aware and not dependent on concrete builders and
        // products.
        Car car = builder1.getResult();
        System.out.println("Car built:\n" + car.getCarType());


       
        // Director may know several building recipes.
        System.out.println("\nCar manual built:\n" + car.printCarManual());
        
        
        CarBuilder builder2 = new CarBuilder();
        director.constructSUV(builder2);

        // The final product is often retrieved from a builder object, since
        // Director is not aware and not dependent on concrete builders and
        // products.
        Car car2 = builder2.getResult();
        System.out.println("Car built:\n" + car2.getCarType());


        // Director may know several building recipes.
        System.out.println("\nCar manual built:\n" + car2.printCarManual());
    }

}