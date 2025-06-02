package StructuralPatterns.Bridge.shapes;

public class Red implements Color{
    @Override
    public void fill() {
        System.out.println("vyplnam s cervenou");
    }
}
