package StructuralPatterns.Decorator.Cviko;

public class UpperCasePrinter extends PrinterDecorator{

    public UpperCasePrinter(Printer wrappedPrinter) {
        super(wrappedPrinter);
    }

    @Override
    public void print(String text) {
        String upper = text.toUpperCase();
        System.out.println(upper);
    }

    @Override
    public void printInBrackets(String text) {
        String upperCase = text.toUpperCase();
        wrappedPrinter.printInBrackets(upperCase);
    }
}
