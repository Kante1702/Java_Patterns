package behavioralPatterns.ChainOfResponsibility.first;




public class Level2SupportHandler implements SupportHandler{

    private SupportHandler nextHandler;
    @Override
    public void handle(Request request) {
        if(request.getPriority() == Priority.INTERMEDIATE){
            System.out.println("level 2 support handled the request");
        }
        else if (nextHandler != null){
            nextHandler.handle(request);
        }
    }

    @Override
    public void setNextHandler(SupportHandler nextHandler) {
        this.nextHandler = nextHandler;
    }
}
