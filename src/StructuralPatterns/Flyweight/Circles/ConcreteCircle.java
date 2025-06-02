package StructuralPatterns.Flyweight.Circles;

public class ConcreteCircle implements Circle {

    private String color;
    private int x;
    private int y;

    public ConcreteCircle(String color) {
        this.color = color;
    }

    @Override
    public void draw() {
        System.out.println("drawing a "+color+" Circle at "+x+" , "+y);
    }

    @Override
    public void setPosition(int x, int y) {
        this.x = x;
        this.y = y;
    }
}
