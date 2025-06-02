package StructuralPatterns.Decorator.Text;

public abstract class TextDecorator implements Text {
    protected Text text;
    public TextDecorator(Text text) {
        this.text = text;
    }


}
