package CreationalPatterns.AbstractFactory;

public abstract class Company {
    public abstract Monitor createMonitor();
    public abstract Gpu createGpu();
}
