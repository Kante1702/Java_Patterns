package StructuralPatterns.Decorator.Coffe;

public class SimpleCoffe implements Coffe{
    @Override
    public double getCost() {
        return 5.0;
    }

    @Override
    public String getDescription() {
        return "Simple Coffe";
    }
}
