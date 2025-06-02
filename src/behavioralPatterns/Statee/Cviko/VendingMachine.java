package behavioralPatterns.Statee.Cviko;

public class VendingMachine {

    private Product[] products;
    private int credit ;
    private Product product;
    private int count;
    private VendingState vendingState;

    public VendingMachine() {
        products = new Product[]{
            new Product("mineralka", 10),
                new Product("dzus", 20),
                new Product("kava", 20),
                new Product("caj", 15),
                new Product("pivo", 15),
        };
        credit = 0;
        vendingState = new MenuState(this);

    }

    void setState(VendingState state) {
        this.vendingState = state;
    }

    public void pressNumber(int number) {
        System.out.println("zakaznik: stlacil tlacidlo: " + number);
        vendingState.setNumber(number);
    }

    public void pressBack() {
        System.out.println("zakaznik: stlacil tlacidlo back");
        vendingState.back();
    }

    public void pay(int amount) { // reakcia na vhodenie mince
        System.out.println("zakaznik: vhodil mincu: " + amount);
        vendingState.pay(amount);
    }

    void addCredit(int amount) {
        credit += amount;
    }

    void setMessage(String message) {
        System.out.println("machine:  " + message);
    }

    void setProduct(int productIndex) {
        product = products[productIndex]; // todo osetrit
    }

    Product getProduct() { // vrati vybrany napoj
        return product;
    }
    void setCount(int productCount) { // nastavi pocet napojov
        count = productCount;
    }

    int getOrderPrice() {
        return count * product.getPrice();
    }

    int getCredit() {
        return credit;
    }

    void deliverProduct() {
        credit -= getOrderPrice();
    }

}
