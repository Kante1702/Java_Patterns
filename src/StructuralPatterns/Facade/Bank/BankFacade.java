package StructuralPatterns.Facade.Bank;

public class BankFacade {

    private AccountCreator accountCreator ;
    private CreditCheck creditCheck ;
    private IdentityVerifier identityVerifier ;
    private WelcomeEmailSender welcomeEmailSender ;

    public BankFacade() {
        this.creditCheck = new CreditCheck();
        this.identityVerifier = new IdentityVerifier();
        this.welcomeEmailSender = new WelcomeEmailSender();
        this.accountCreator = new AccountCreator();
    }

    public void openAccount(String name, String ID) {
        if(identityVerifier.verify(name, ID) && creditCheck.checkCreditStore(ID)){
            accountCreator.createAccount(name);
            welcomeEmailSender.sendWelcomeEmail(name);
            System.out.println("Account opening completed sucessfully");
        }
        else{
            System.out.println("failed to open account for "+name);
        }
    }


}
