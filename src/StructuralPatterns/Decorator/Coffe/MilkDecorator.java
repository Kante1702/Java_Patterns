package StructuralPatterns.Decorator.Coffe;

public class MilkDecorator extends CoffeDecorator{

    public MilkDecorator(Coffe decoratedCoffe) {
        super(decoratedCoffe);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", Milk ";
    }

    @Override
    public double getCost() {
        return super.getCost() + 2;
    }


}
