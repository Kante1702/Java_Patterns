package StructuralPatterns.Composite.boxes;

public class VideoGame extends product{


    protected VideoGame(String name, double price) {
        super(name, price);
    }

    @Override
    public double calculatePrice() {
        return getPrice();
    }
}
