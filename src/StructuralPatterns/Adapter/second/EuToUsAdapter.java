package StructuralPatterns.Adapter.second;

public class EuToUsAdapter implements USPlug{

    private EuropeanCharger charger;
    public EuToUsAdapter(EuropeanCharger charger) {
        this.charger = charger;
    }


    @Override
    public void plugInUS() {
        System.out.println("Using adapter to convert 230V -> 110V");
        charger.plugInEu();
    }
}
