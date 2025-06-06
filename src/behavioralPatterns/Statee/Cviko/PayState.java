package behavioralPatterns.Statee.Cviko;

public class PayState extends VendingState{


    public PayState(VendingMachine machine) {
        super(machine);
    }

    @Override
    void setNumber(int number) {

    }

    @Override
    void back() {
        machine.setState(new CountState(machine));
    }
    @Override
    void pay(int amount){
        super.pay(amount);
        deliverIfPaid();
    }

    private void deliverIfPaid(){
        if(machine.getCredit() >= machine.getOrderPrice()){
            machine.deliverProduct();
            machine.setMessage("zoberte si tovar, zostavajuci kredit: " + machine.getCredit());
            machine.setState(new MenuState(machine));
        }
        else
        {
            machine.setMessage("zostava zaplatit: " + (machine.getOrderPrice()-machine.getCredit()));
        }
    }
}
