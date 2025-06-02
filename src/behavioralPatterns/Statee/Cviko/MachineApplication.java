package behavioralPatterns.Statee.Cviko;

public class MachineApplication {
    public static void main(String[] args) {
        VendingMachine machine = new VendingMachine();

        machine.pressNumber(1);
        machine.pressNumber(2);
        machine.pay(20);
        machine.pay(30);

        machine.pressNumber(3);
        machine.pressNumber(1);
    }
}
