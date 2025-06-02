package StructuralPatterns.Decorator.Coffe;

public abstract class CoffeDecorator implements Coffe{

    protected Coffe decoratedCoffe;
    public CoffeDecorator(Coffe decoratedCoffe) {
        this.decoratedCoffe = decoratedCoffe;
    }


    @Override
    public double getCost() {
        return decoratedCoffe.getCost();
    }

    @Override
    public String getDescription() {
        return decoratedCoffe.getDescription();
    }
}
