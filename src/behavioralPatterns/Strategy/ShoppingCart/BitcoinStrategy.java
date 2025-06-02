package behavioralPatterns.Strategy.ShoppingCart;

public class BitcoinStrategy implements PaymentStrategy{

    private String walletAddress;

    public BitcoinStrategy(String walletAddress) {
        this.walletAddress = walletAddress;
    }

    @Override
    public void pay(int amount) {
        System.out.println("paid "+amount+" using Bitcoin");
    }
}
