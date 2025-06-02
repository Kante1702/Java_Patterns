package behavioralPatterns.Statee.Machine;

public class IdleState implements CoffeeMachineState{

    private CoffeeMachine coffeeMachine;

    public IdleState(CoffeeMachine coffeeMachine) {
        this.coffeeMachine = coffeeMachine;
    }


    @Override
    public void insertCoin() {
        System.out.println("coin inserted, please select coffe\n");
        coffeeMachine.setState(coffeeMachine.getSelectingState());
    }

    @Override
    public void selectCoffee() {
        System.out.println("insert coin first");
    }

    @Override
    public void dispenseCoffee() {
        System.out.println("insert coin and select coffe to dispense");
    }
}
