package StructuralPatterns.Facade.Bank;

public class IdentityVerifier {
    public boolean verify(String name, String id){
        System.out.println("veryfying identity of "+name);
        return true;
    }
}
