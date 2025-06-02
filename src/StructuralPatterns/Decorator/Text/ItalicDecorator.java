package StructuralPatterns.Decorator.Text;

public class ItalicDecorator extends TextDecorator {
    public ItalicDecorator(Text text) {
        super(text);
    }

    @Override
    public String render() {
        return "<i>" + text.render() + "</i>";
    }
}
