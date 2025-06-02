package CreationalPatterns.Prototype_1.Shapes;

public class Rectangle extends Shape {

    protected int width;
    protected int height;
    protected String color;

    public Rectangle() {}
    public Rectangle(Rectangle sorce) {
        super(sorce);
        this.width = sorce.width;
        this.height = sorce.height;
        this.color = sorce.color;

    }
    @Override
    public Shape clone() {
        return new Rectangle(this);//vola vlastny copy-constructor
    }

    @Override
    public void draw() {
        System.out.println("Drawing rectangle " + width + "x" + height + " in " + color);
    }
}
