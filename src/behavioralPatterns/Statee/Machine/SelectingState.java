package behavioralPatterns.Statee.Machine;

public class SelectingState implements CoffeeMachineState{

    private CoffeeMachine coffeeMachine;

    public SelectingState(CoffeeMachine coffeeMachine) {
        this.coffeeMachine = coffeeMachine;
    }

    @Override
    public void insertCoin() {
        System.out.println("coin already inserted");
    }

    @Override
    public void selectCoffee() {
        System.out.println("you selected coffee");
        coffeeMachine.setState(coffeeMachine.getDispensingState());
    }

    @Override
    public void dispenseCoffee() {
        System.out.println("please select a drink first");
    }
}
