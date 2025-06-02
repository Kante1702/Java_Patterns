package CreationalPatterns.Prototype_1.Vehicles;

public abstract class Vehicle {
    private String model;
    private String color;
    private String brand;

    protected Vehicle(Vehicle vehicle)
    {
        this.model = vehicle.model;
        this.color = vehicle.color;
        this.brand = vehicle.brand;
    }

}
