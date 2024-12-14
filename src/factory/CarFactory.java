package factory;

import car.Car;
import car.CarModel;
import car.Sedan;
import car.SUV;

public class CarFactory {
    public static Car createCar(CarModel model, String color) {
        return switch (model) {
            case SEDAN -> new Sedan(color);
            case SUV -> new SUV(color);
            default -> throw new IllegalArgumentException("Unknown car model: " + model);
        };
    }
}
