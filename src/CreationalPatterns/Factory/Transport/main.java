package CreationalPatterns.Factory.Transport;

public class main {
    public static void main(String[] args) {

        TransportFactory transportFactory = new TransportFactory();
        Transport t1 =transportFactory.createTransport("car");
        t1.move();
        Transport t2 =transportFactory.createTransport("BIKE");
        t2.move();
//        Transport t3 =transportFactory.createTransport("Truck");
//        t3.move();
        Transport t4 =transportFactory.createTransport("Scooter");
        t4.move();

    }
}
