package CreationalPatterns.Factory;

public class Car implements Transport{
    @Override
    public void move() {
        //logika pohybu auta
        System.out.println("Car move");
    }
}
