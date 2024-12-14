package registry;

import car.Car;
import car.SUV;
import car.Sedan;

import java.util.HashMap;
import java.util.Map;

public class CarRegistry {
    private final Map<String, Car> carMap = new HashMap<>();

    public CarRegistry() {
        // Initialisation des prototypes
        carMap.put("Sedan", new Sedan("White"));
        carMap.put("SUV", new SUV("Black"));
    }

    // Récupère un clone du prototype
    public Car getCar(String model) {
        Car prototype = carMap.get(model);
        if (prototype == null) {
            return null; // Retourne null si le prototype n'existe pas
        }
        return prototype.cloneCar();
    }

    // Permet d'ajouter un prototype dynamique
    public void addPrototype(String model, Car car) {
        carMap.put(model, car);
    }
}
