package CreationalPatterns.Builder.Burger;

public class Burger {

    private final String bun;
    private final String meat;
    private final boolean cheese;
    private final boolean lettuce;
    private final boolean tomato;

    public Burger(BurgerBuilder builder) {
        this.bun = builder.bun;
        this.meat = builder.meat;
        this.cheese = builder.cheese;
        this.lettuce = builder.lettuce;
        this.tomato = builder.tomato;
    }

    @Override
    public String toString() {
        return "Burger{" +
                "bun='" + bun + '\'' +
                ", meat='" + meat + '\'' +
                ", cheese=" + cheese +
                ", lettuce=" + lettuce +
                ", tomato=" + tomato +
                '}';
    }
}
