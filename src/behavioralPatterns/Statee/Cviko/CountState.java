package behavioralPatterns.Statee.Cviko;

public class CountState extends VendingState{


    public CountState(VendingMachine machine) {
        super(machine);
    }

    @Override
    void setNumber(int number) {
        machine.setCount(number);
        machine.setMessage("pocet "+number);
        machine.setState(new PayState(machine));
    }

    @Override
    void back() {
        machine.setState(new MenuState(machine));
    }
}
