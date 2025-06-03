package CreationalPatterns.Factory.Transport;

public class Car implements Transport{
    @Override
    public void move() {
        //logika pohybu auta
        System.out.println("Car move");
    }
}
