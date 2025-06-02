package CreationalPatterns.Factory;

import CreationalPatterns.Prototype_1.Vehicles.Bus;

public class TransportFactory {
    public Transport createTransport(String type) {
        return switch (type.toLowerCase()){
            case "car" -> new Car();
            case "bike" -> new Bike();
            case "scooter" -> new Scooter();
            default -> throw new IllegalArgumentException("Invalid Transport: "+type);
        };
    }
}
