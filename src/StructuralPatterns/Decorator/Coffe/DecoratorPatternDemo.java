package StructuralPatterns.Decorator.Coffe;

public class DecoratorPatternDemo {
    public static void main(String[] args) {

        Coffe coffe = new SimpleCoffe();
        System.out.println(coffe.getDescription() + " e"+coffe.getCost());
        //output Simple Coffe e5.0

        coffe = new MilkDecorator(coffe);
        System.out.println(coffe.getDescription() + " e"+coffe.getCost());
        //output Simple Coffee, Milk e7.0

        coffe = new SugarDecorator(coffe);
        System.out.println(coffe.getDescription() + " e"+coffe.getCost());
        //output Simple coffe, Milk, sugar e8.0


    }
}
