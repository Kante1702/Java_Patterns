package behavioralPatterns.Statee.Cviko;

public class Product {

    private String product;
    private int cena;
    public Product(String nazov, int cena){
        this.product = nazov;
        this.cena = cena;
    }

    public String getName(){
        return product;
    }
    public int getPrice(){
        return cena;
    }
}
