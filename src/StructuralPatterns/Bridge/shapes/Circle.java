package StructuralPatterns.Bridge.shapes;



public class Circle extends shape {

    public Circle(Color color) {
        super(color);
    }


    @Override
    void draw() {
        System.out.println("vyrkeslujem kruh");
        color.fill();
    }
}
