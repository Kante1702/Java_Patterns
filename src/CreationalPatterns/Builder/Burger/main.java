package CreationalPatterns.Builder.Burger;

public class main {
    public static void main(String[] args) {
        Burger burger = new BurgerBuilder().bun("tttttt").cheese(true).lettuce(true).build();
        System.out.println(burger);

    }
}
