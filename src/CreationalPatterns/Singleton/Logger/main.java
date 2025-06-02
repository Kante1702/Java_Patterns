package CreationalPatterns.Singleton.Logger;

public class main {
    public static void main(String[] args) {

       Logger logger1 = Logger.getInstance();
       logger1.log("prva sprava");

       Logger logger2 = Logger.getInstance();
       logger2.log("druha sprava");

        System.out.println("su objekty rovnake?: "+(logger1 ==logger2));

    }
}
