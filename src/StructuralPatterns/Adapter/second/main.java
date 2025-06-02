package StructuralPatterns.Adapter.second;

public class main {
    public static void main(String[] args) {
        EuropeanCharger euroCharger = new EuropeanCharger();
        USPlug adapter = new EuToUsAdapter(euroCharger);

        adapter.plugInUS(); // klient vie len o USPlug
    }
}