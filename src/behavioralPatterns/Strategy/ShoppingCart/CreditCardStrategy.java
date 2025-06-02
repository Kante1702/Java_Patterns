package behavioralPatterns.Strategy.ShoppingCart;

public class CreditCardStrategy implements PaymentStrategy {

    private String cardNumber;
    public CreditCardStrategy(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    @Override
    public void pay(int amount) {
        System.out.println("paid "+amount+" using credit card");
    }
}
