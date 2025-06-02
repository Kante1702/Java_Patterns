package StructuralPatterns.Decorator.Coffe;

public class Espresso implements Coffe{

    @Override
    public double getCost() {
        return 10.0;
    }

    @Override
    public String getDescription() {
        return "Espresso";
    }
}
