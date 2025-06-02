package StructuralPatterns.Decorator.Coffe;

public class SugarDecorator extends CoffeDecorator{
    public SugarDecorator(Coffe decoratedCoffe) {
        super(decoratedCoffe);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", sugar";
    }
    @Override
    public double getCost() {
        return super.getCost() + 1.0;
    }

}
