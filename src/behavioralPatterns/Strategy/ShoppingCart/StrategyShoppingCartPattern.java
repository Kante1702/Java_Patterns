package behavioralPatterns.Strategy.ShoppingCart;

public class StrategyShoppingCartPattern {
    public static void main(String[] args) {

        SchoppingCart cart = new SchoppingCart();

        Item item1 = new Item("1234",10);
        Item item2 = new Item("5678",40);

        cart.addItem(item1);
        cart.addItem(item2);

        cart.pay(new CreditCardStrategy("116516466"));
        cart.pay(new BitcoinStrategy("atdatdatd"));
        cart.pay(new PaypalStrategy("neviviene"));


//        paid 50 using credit card
//        paid 50 using Bitcoin
//        paid 50 using paypal

    }
}
