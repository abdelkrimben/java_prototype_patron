package car;

public class SUV extends Car {
    public SUV(String color) {
        super("SUV", color);
    }

    @Override
    public SUV cloneCar() {
        return new SUV(this.getColor());
    }
}
