package car;

public class Sedan extends Car {
    public Sedan(String color) {
        super("Sedan", color);
    }

    @Override
    public Sedan cloneCar() {
        return new Sedan(this.getColor());
    }
}
