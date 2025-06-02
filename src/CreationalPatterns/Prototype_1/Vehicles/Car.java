package CreationalPatterns.Prototype_1.Vehicles;

public class Car extends Vehicle {

    private String model;
    private String color;
    private String brand;
    private int topSpeed;

    public Car(Car car){
        super(car);
        this.topSpeed = car.topSpeed;
        this.model = car.model;
        this.color = car.color;
        this.brand = car.brand;
    }


    @Override
    public Car clone() {
        return new Car(this);
    }
}
