package StructuralPatterns.Bridge.shapes;

public class BridgePatternDemo {
    public static void main(String[] args) {
        shape redCircle = new Circle(new Red());
        shape greenCircle = new Circle(new Green());

        greenCircle.draw();
        redCircle.draw();
    }
}
