package behavioralPatterns.ChainOfResponsibility.first;



public class Level3SupportHandler implements SupportHandler{


    @Override
    public void handle(Request request) {
        if(request.getPriority() == Priority.CRITICAL){
            System.out.println("Level 3 support handled the request");
        }
        else {
            System.out.println("Request cannot be handled");
        }
    }

    @Override
    public void setNextHandler(SupportHandler nextHandler) {
        //nic
    }
}
