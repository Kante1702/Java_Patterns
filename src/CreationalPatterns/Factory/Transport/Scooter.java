package CreationalPatterns.Factory.Transport;

public class Scooter implements Transport{
    @Override
    public void move() {
        //logika pohybu scootera
        System.out.println("we are scooting");
    }
}
