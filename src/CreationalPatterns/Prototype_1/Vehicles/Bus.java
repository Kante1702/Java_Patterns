package CreationalPatterns.Prototype_1.Vehicles;

public class Bus extends Vehicle {
    private int doors;

    public Bus(Bus bus){
        super(bus);
        this.doors = bus.doors;
    }
    @Override
    public Bus clone(){
        return new Bus(this);
    }
}
