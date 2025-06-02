package StructuralPatterns.Bridge.shapes;

public abstract class shape {
    protected Color color;

    public shape(Color color) {
        this.color = color;
    }
    abstract void draw();
}
