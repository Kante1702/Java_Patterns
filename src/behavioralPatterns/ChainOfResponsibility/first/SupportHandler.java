package behavioralPatterns.ChainOfResponsibility.first;



public interface SupportHandler {
    void handle(Request request);


    void setNextHandler(SupportHandler nextHandler);

}
