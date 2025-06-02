package StructuralPatterns.Decorator.Text;

public class TextDecoratorDemo {
    public static void main(String[] args) {

        Text text = new PlainText("dobry den");
        text = new BoldDecorator(text);
        text = new ItalicDecorator(text);
        System.out.println(text.render());

    }
}
