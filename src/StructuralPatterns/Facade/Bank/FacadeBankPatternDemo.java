package StructuralPatterns.Facade.Bank;

public class FacadeBankPatternDemo {
    public static void main(String[] args) {
        BankFacade bank = new BankFacade();
        bank.openAccount("Martin Kanta", "126735");
//        veryfying identity of Martin Kanta
//        Checking credit store for ID 126735
//        Account created for Martin Kanta
//        Welcome email sent to Martin Kanta
//        Account opening completed sucessfully
    }
}
