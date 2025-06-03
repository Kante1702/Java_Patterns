package CreationalPatterns.AbstractFactory.Components;

public class MsiManufacturer extends Company{

    @Override
    public Monitor createMonitor() {
        return new MsiMonitor();
    }

    @Override
    public Gpu createGpu() {
        return new MsiGpu();
    }
}
