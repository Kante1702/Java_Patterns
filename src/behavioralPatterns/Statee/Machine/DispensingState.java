package behavioralPatterns.Statee.Machine;

public class DispensingState implements CoffeeMachineState{

    private CoffeeMachine coffeeMachine;

    public DispensingState(CoffeeMachine coffeeMachine) {
        this.coffeeMachine = coffeeMachine;
    }

    @Override
    public void insertCoin() {
        System.out.println("please wait");
    }

    @Override
    public void selectCoffee() {
        System.out.println("Already selected...");
    }

    @Override
    public void dispenseCoffee() {
        System.out.println("Dispensing your drink... done!");
        coffeeMachine.setState(coffeeMachine.getIdleState());
    }
}
