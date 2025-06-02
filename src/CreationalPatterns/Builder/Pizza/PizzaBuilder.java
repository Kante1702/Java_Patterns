package CreationalPatterns.Builder.Pizza;

public class PizzaBuilder {

    String size;
    boolean pepperoni;
    boolean bacon;
    boolean cheese;

    public PizzaBuilder size(String size){
        this.size = size;
        return this;
    }
    public PizzaBuilder addpepperoni(boolean pepperoni){
        this.pepperoni = pepperoni;
        return this;
    }
    public PizzaBuilder addbacon(boolean bacon){
        this.bacon = bacon;
        return this;
    }
    public PizzaBuilder addcheese(boolean cheese){
        this.cheese = cheese;
        return this;
    }

    public Pizza build(){
        return new Pizza(this);
    }
}
