package main;

import car.Car;
import car.CarModel;
import registry.CarRegistry;
import factory.CarFactory;

public class PrototypeDemo {
    public static void main(String[] args) {
        // Création d'un registre de voitures
        CarRegistry carRegistry = new CarRegistry();

        // Obtenir un Sedan cloné via CarFactory
        Car sedan = CarFactory.createCar(CarModel.SEDAN, "Green");
        System.out.println(sedan);

        // Cloner un SUV à partir du registre
        Car suv = carRegistry.getCar("SUV");
        System.out.println(suv);

        // Ajouter un nouveau prototype à la volée via CarFactory
        Car hatchback = CarFactory.createCar(CarModel.SEDAN, "Green");
        carRegistry.addPrototype("Hatchback", hatchback);

        // Cloner le nouveau prototype ajouté
        Car clonedHatchback = carRegistry.getCar("Hatchback");
        System.out.println(clonedHatchback);
    }
}
