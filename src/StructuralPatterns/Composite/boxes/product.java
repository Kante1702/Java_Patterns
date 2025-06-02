package StructuralPatterns.Composite.boxes;

public abstract class product implements Box {
    protected final String name;
    protected final double price;

    protected product(String name, double price) {
        this.name = name;
        this.price = price;
    }
    public double getPrice() {
        return price;
    }
}
