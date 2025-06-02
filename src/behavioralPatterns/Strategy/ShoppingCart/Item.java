package behavioralPatterns.Strategy.ShoppingCart;

public class Item {

    private int price;
    private String id;

    public Item(String id, int price) {
        this.id = id;
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

}
