package behavioralPatterns.Strategy.ShoppingCart;

public class PaypalStrategy implements PaymentStrategy{

   private String email;

   public PaypalStrategy(String email) {
       this.email = email;
   }


    @Override
    public void pay(int amount) {
        System.out.println("paid "+amount+" using paypal");
    }
}
