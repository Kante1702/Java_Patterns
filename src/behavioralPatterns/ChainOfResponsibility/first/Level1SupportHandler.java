package behavioralPatterns.ChainOfResponsibility.first;

public class Level1SupportHandler implements SupportHandler{

    private SupportHandler nextHandler;


    @Override
    public void handle(Request request) {
        if(request.getPriority() == Priority.BASIC){
            System.out.println("level 1 support handled the request");
        }
        else if(nextHandler != null) {
            nextHandler.handle(request);
        }
    }

    @Override
    public void setNextHandler(SupportHandler nextHandler) {
        this.nextHandler = nextHandler;
    }
}
