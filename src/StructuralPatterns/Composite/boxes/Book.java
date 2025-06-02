package StructuralPatterns.Composite.boxes;

public class Book extends product{

    public Book(String title, double price)
    {
        super(title, price);
    }

    @Override
    public double calculatePrice() {
        return getPrice();
    }
}
