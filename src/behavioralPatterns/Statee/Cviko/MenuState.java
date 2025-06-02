package behavioralPatterns.Statee.Cviko;

public class MenuState extends VendingState{


    public MenuState(VendingMachine machine) {
        super(machine);
    }

    @Override
    void setNumber(int number) {
        machine.setProduct(number);
        machine.setMessage("vybrany napoj "+machine.getProduct().getName());
        machine.setState(new CountState(machine));
    }

    @Override
    void back() {

    }
}
