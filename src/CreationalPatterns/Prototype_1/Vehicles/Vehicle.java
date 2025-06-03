package CreationalPatterns.Prototype_1.Vehicles;

public abstract class Vehicle {
    protected String model;
    protected String color;
    protected String brand;

    protected Vehicle(Vehicle vehicle)
    {
        this.model = vehicle.model;
        this.color = vehicle.color;
        this.brand = vehicle.brand;
    }

}
