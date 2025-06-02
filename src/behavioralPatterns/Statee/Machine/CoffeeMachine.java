package behavioralPatterns.Statee.Machine;

public class CoffeeMachine {

    private CoffeeMachineState idleState;
    private CoffeeMachineState selectingState;
    private CoffeeMachineState dispensingState;

    private CoffeeMachineState currentState;

    public CoffeeMachine() {
        idleState = new IdleState(this);
        selectingState = new SelectingState(this);
        dispensingState = new DispensingState(this);
        currentState = idleState;
    }

    public void setState(CoffeeMachineState state) {
        currentState = state;
    }
    public CoffeeMachineState insertCoin(){
        currentState.insertCoin();
        return null;
    }
    public void selectCoffee(){
        currentState.selectCoffee();
    }
    public void dispenseCoffee(){
        currentState.dispenseCoffee();
    }

    public CoffeeMachineState getIdleState() {
        return idleState;
    }
    public CoffeeMachineState getSelectingState() {
        return selectingState;
    }
    public CoffeeMachineState getDispensingState() {
        return dispensingState;
    }
}
