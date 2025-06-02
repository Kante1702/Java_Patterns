package StructuralPatterns.Bridge.shapes;

public class Square extends shape{

    public Square(Color color) {
        super(color);
    }

    @Override
    void draw() {
        System.out.println("kreslim stvorec");
        color.fill();
    }
}
