package CreationalPatterns.Prototype_1.Shapes;

public abstract class Shape implements Cloneable {

    protected int x;
    protected int y;
    protected String Color;

    public Shape(){}

    public Shape(Shape source){
        this.x = source.x;
        this.y = source.y;
        this.Color = source.Color;

    }

    public abstract void draw();

    @Override
    public Shape clone() {
        try {
            return (Shape) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}
