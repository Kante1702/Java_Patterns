package behavioralPatterns.Statee.Machine;

public class CoffeeMachineTest {
    public static void main(String[] args) {
        CoffeeMachine machine = new CoffeeMachine();

        machine.insertCoin();
        machine.selectCoffee();
        machine.dispenseCoffee();
        // Skús znovu bez mince:
        machine.selectCoffee();
    }
}