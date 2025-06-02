package CreationalPatterns.Prototype_1.Shapes;

public class ShapesPrototypePatternDemo {
    public static void main(String[] args) {
        Rectangle original = new Rectangle();
        original.x = 10;
        original.y = 20;
        original.width = 100;
        original.height = 200;
        original.color = "red";

        Rectangle clone = (Rectangle) original.clone();

        System.out.println("Original: ");
        original.draw();

        System.out.println("Clone: ");
        clone.draw();

//        Original:
//        Drawing rectangle 100x200 in red
//        Clone:
//        Drawing rectangle 100x200 in red


    }
}
