package CreationalPatterns.Factory;

public class Bike implements Transport{
    @Override
    public void move() {
        //logika pohybu biku
        System.out.println("Bike move");
    }
}
