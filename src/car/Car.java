package car;

public abstract class Car {
    private final String model;
    private final String color;

    public Car(String model, String color) {
        this.model = model;
        this.color = color;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    // Méthode abstraite pour le clonage
    public abstract Car cloneCar();

    @Override
    public String toString() {
        return "Model: " + model + ", Color: " + color;
    }
}
