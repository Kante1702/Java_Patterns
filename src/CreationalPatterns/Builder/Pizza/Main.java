package CreationalPatterns.Builder.Pizza;

public class Main {
    public static void main(String[] args) {
        Pizza pizza = new PizzaBuilder().size("large").addcheese(true).addbacon(true).build();
        System.out.println(pizza.toString());
    }
}
