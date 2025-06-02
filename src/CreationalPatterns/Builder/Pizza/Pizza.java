package CreationalPatterns.Builder.Pizza;

public class Pizza {

    private String size;
    private boolean cheese;
    private boolean pepperoni;
    private boolean bacon;

    Pizza(PizzaBuilder builder) {
        this.bacon = builder.bacon;
        this.cheese = builder.cheese;
        this.pepperoni = builder.pepperoni;
        this.size = builder.size;
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "size='" + size + '\'' +
                ", cheese=" + cheese +
                ", pepperoni=" + pepperoni +
                ", bacon=" + bacon +
                '}';
    }
}
