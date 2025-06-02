package StructuralPatterns.Bridge.shapes;

public class Green implements Color{
    @Override
    public void fill() {
        System.out.println("vyplnam so zelenou");
    }
}
