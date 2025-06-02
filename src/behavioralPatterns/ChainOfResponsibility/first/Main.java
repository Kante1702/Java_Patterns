package behavioralPatterns.ChainOfResponsibility.first;

public class Main {
    public static void main(String[] args) {
        SupportHandler level1Handler = new Level1SupportHandler();
        SupportHandler level2Handler = new Level2SupportHandler();
        SupportHandler level3Handler = new Level3SupportHandler();

        level1Handler.setNextHandler(level2Handler);
        level2Handler.setNextHandler(level3Handler);

        Request request1 = new Request(Priority.BASIC);
        Request request2 = new Request(Priority.INTERMEDIATE);
        Request request3 = new Request(Priority.CRITICAL);
        Request request4 = new Request(null);

        level1Handler.handle(request1);
        level1Handler.handle(request2);
        level1Handler.handle(request3);
        level1Handler.handle(request4);
    }
}
