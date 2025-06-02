package CreationalPatterns.Builder.Burger;

public class BurgerBuilder {

    protected String bun = "classic"; //default
    protected String meat = "beef"; //default
    protected boolean cheese;
    protected boolean lettuce;
    protected boolean tomato;

    public BurgerBuilder bun(String bun) {
        this.bun = bun;
        return this;
    }
    public BurgerBuilder meat(String meat) {
        this.meat = meat;
        return this;
    }
    public BurgerBuilder cheese(boolean cheese) {
        this.cheese = cheese;
        return this;
    }
    public BurgerBuilder lettuce(boolean lettuce) {
        this.lettuce = lettuce;
        return this;
    }
    public BurgerBuilder tomato(boolean tomato) {
        this.tomato = tomato;
        return this;
    }
    public Burger build() {
        return new Burger(this);
    }

}
